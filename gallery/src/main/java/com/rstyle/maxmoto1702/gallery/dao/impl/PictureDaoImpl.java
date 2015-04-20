package com.rstyle.maxmoto1702.gallery.dao.impl;

import com.rstyle.maxmoto1702.gallery.dao.PictureDao;
import com.rstyle.maxmoto1702.gallery.mappers.PictureRowMapper;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
public class PictureDaoImpl extends JdbcDaoSupport implements PictureDao {

    private static final String SQL_SELECT_ALL = "SELECT * FROM PICTURES";
    private static final String SQL_INSERT = "INSERT INTO PICTURES (NAME, DESCRIPTION, CREATE_DATE, EDIT_DATE, THUMB_PATH, FILE_PATH) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM PICTURES WHERE ID = ?";
    private static final String SQL_UPDATE = "UPDATE SET NAME = ?, DESCRIPTION = ?, CREATE_DATE = ?, EDIT_DATE = ?, THUMB_PATH = ?, FILE_PATH = ? WHERE ID = ?";

    // Vjжет не связаться
    @Override
    public List<Picture> getAll() {
        List<Picture> pictures;
        pictures = getJdbcTemplate().query(SQL_SELECT_ALL, new PictureRowMapper());
        return pictures;
    }

    @Override
    public void insert(Picture picture) {
        getJdbcTemplate().update(SQL_INSERT,
                picture.getName(),
                picture.getDescription(),
                picture.getCreateDate(),
                picture.getEditDate(),
                picture.getThumbPath(),
                picture.getFilePath());
    }

    @Override
    public void update(Picture picture) {
        getJdbcTemplate().update(SQL_UPDATE,
                picture.getName(),
                picture.getDescription(),
                picture.getCreateDate(),
                picture.getEditDate(),
                picture.getThumbPath(),
                picture.getFilePath(),
                picture.getId());
    }

    @Override
    public void delete(Picture picture) {
        getJdbcTemplate().update(SQL_DELETE,
                picture.getId());
    }
}
