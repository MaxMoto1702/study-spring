package com.rstyle.maxmoto1702.gallery.extractors;

import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by maksim.serebryanskiy on 20.04.2015.
 */
public class PictureExtractor implements ResultSetExtractor<Picture> {

    private static final Logger LOG = LoggerFactory.getLogger(PictureExtractor.class);

    @Override
    public Picture extractData(ResultSet rs) throws SQLException, DataAccessException {
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
