package com.rstyle.maxmoto1702.gallery.mappers;

import com.rstyle.maxmoto1702.gallery.extractors.PictureExtractor;
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
        PictureExtractor pictureExtractor = new PictureExtractor();
        return pictureExtractor.extractData(rs);
    }
}
