package com.rstyle.maxmoto1702.spitter.persistence;

import com.rstyle.maxmoto1702.spitter.domain.Spitter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by m on 05.04.2015.
 */
public class JdbcSpitterDAO extends JdbcDaoSupport implements SpitterDAO {

    private static final String SQL_INSERT_SPITTER =
            "INSERT INTO SPITTER (USERNAME, PASSWORD, FULLNAME, EMAIL) " +
                    "VALUES (?, ?, ?, ?)";

    private static final String SQL_SELECT_SPITTER_BY_ID =
            "SELECT ID, USERNAME, USERNAME, FULLNAME, EMAIL " +
                    "FROM SPITTER " +
                    "WHERE ID = ?";

    private JdbcTemplate jdbcTemplate;

    @Override
    public void addSpitter(Spitter spitter) {
        getJdbcTemplate().update(SQL_INSERT_SPITTER, spitter.getUsername(),
                spitter.getPassword(),
                spitter.getFullName(),
                spitter.getEmail());
        spitter.setId(queryForIdentity());
    }

    private int queryForIdentity() {
        return 0;
    }

    @Override
    public Spitter getSpitterById(long id) {
        return getJdbcTemplate().queryForObject(
                SQL_SELECT_SPITTER_BY_ID,
                new RowMapper<Spitter>() {
                    public Spitter mapRow(ResultSet rs, int rowNumber)
                            throws SQLException {
                        Spitter spitter = new Spitter();
                        spitter.setId(rs.getLong(1));
                        spitter.setUsername(rs.getString(2));
                        spitter.setPassword(rs.getString(3));
                        spitter.setFullName(rs.getString(4));
                        return spitter;
                    }
                },
                id
        );
    }

}
