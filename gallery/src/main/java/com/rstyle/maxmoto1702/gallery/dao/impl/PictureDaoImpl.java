package com.rstyle.maxmoto1702.gallery.dao.impl;

import com.rstyle.maxmoto1702.gallery.dao.PictureDao;
import com.rstyle.maxmoto1702.gallery.extractors.PictureExtractor;
import com.rstyle.maxmoto1702.gallery.mappers.PictureRowMapper;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.Date;
import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
public class PictureDaoImpl extends JdbcDaoSupport implements PictureDao {

    private static final Logger LOGGER = LoggerFactory.getLogger(PictureDaoImpl.class);

    private static final String SQL_SELECT_ALL   = "SELECT * FROM PICTURES";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM PICTURES WHERE ID = ?";
    private static final String SQL_INSERT = "INSERT INTO PICTURES (NAME, DESCRIPTION, THUMB_PATH, FILE_PATH) VALUES (?, ?,  ?, ?)";
    private static final String SQL_DELETE = "DELETE FROM PICTURES WHERE ID = ?";
    private static final String SQL_UPDATE = "UPDATE PICTURES SET NAME = ?, DESCRIPTION = ?, EDIT_DATE = ?, THUMB_PATH = ?, FILE_PATH = ? WHERE ID = ?";
    private static final String SQL_GET_INDENTITY = "SELECT IDENT_CURRENT('PICTURES')";

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
                picture.getThumbPath(),
                picture.getFilePath());
        picture.setId(getIdentity());
    }

    private Long getIdentity() {
        return getJdbcTemplate().queryForObject(SQL_GET_INDENTITY, Long.class);
    }

    @Override
    public void update(Picture picture) {
        getJdbcTemplate().update(SQL_UPDATE,
                picture.getName(),
                picture.getDescription(),
                new Date(System.currentTimeMillis()),
                picture.getThumbPath(),
                picture.getFilePath(),
                picture.getId());
    }

    @Override
    public void delete(Picture picture) {
        getJdbcTemplate().update(SQL_DELETE,
                picture.getId());
    }

    @Override
    public Picture getById(Long id) {
        LOGGER.debug("Picture ID: " + id);
        Picture picture = getJdbcTemplate().queryForObject(SQL_SELECT_BY_ID, new PictureRowMapper(), id);
        return picture;
    }
}
