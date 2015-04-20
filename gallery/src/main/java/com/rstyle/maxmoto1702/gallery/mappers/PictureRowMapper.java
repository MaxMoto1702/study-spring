package com.rstyle.maxmoto1702.gallery.mappers;

import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by m on 20.04.2015.
 */
public class PictureRowMapper implements RowMapper<Picture> {

    @Override
    public Picture mapRow(ResultSet rs, int rowNum) throws SQLException {
        Picture picture = new Picture();
        picture.setId(rs.getLong("ID"));
        picture.setName(rs.getString("NAME"));
        picture.setDescription(rs.getString("DESCRIPTION"));
        picture.setCreateDate(rs.getDate("CREATE_DATE"));
        picture.setEditDate(rs.getDate("EDIT_DATE"));
        picture.setThumbPath(rs.getString("THUMB_PATH"));
        picture.setFilePath(rs.getString("FILE_PATH"));
        return picture;
    }
}
