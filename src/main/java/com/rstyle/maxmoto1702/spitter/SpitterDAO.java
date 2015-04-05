package com.rstyle.maxmoto1702.spitter;

import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Created by m on 05.04.2015.
 */
public interface SpitterDAO {

    void setJdbcTemplate(JdbcTemplate jdbcTemplate);

    void addSpitter(Spitter spitter);

    Spitter getSpitterById(long id);
}
