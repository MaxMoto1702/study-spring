package com.rstyle.maxmoto1702.gallery.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.yandex.qatools.properties.PropertyLoader;
import ru.yandex.qatools.properties.annotations.Property;
import ru.yandex.qatools.properties.annotations.Resource;

/**
 * Created by maksim.serebryanskiy on 14.04.2015.
 */
@Component
@Resource.Classpath({"db.properties", "db.bak.properties"})
public class DbProperties {

    private static final Logger LOG = LoggerFactory.getLogger(DbProperties.class);
    @Property("driver")
    private String driver;
    @Property("url")
    private String url;
    @Property("username")
    private String username;
    @Property("password")
    private String password;

    public DbProperties() {
        LOG.debug("Initialization properties");
        PropertyLoader.populate(this);
    }

    public String getDriver() {
        return driver;
    }

    public String getUrl() {
        return url;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
