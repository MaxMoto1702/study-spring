package com.rstyle.maxmoto1702.gallery.datasources;

import com.rstyle.maxmoto1702.gallery.properties.DbProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by m on 20.04.2015.
 */
@Component("dataSource")
public class DriverManagerDataSource extends org.springframework.jdbc.datasource.DriverManagerDataSource {

    @Autowired
    public void setProperties(DbProperties dbProperties) {
        setDriverClassName(dbProperties.getDriver());
        setUrl(dbProperties.getUrl());
        setUsername(dbProperties.getUsername());
        setPassword(dbProperties.getPassword());
    }
}
