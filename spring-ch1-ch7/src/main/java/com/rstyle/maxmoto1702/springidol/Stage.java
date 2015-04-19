package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Stage {

    private static final Logger LOG = LoggerFactory.getLogger(Stage.class);

    private Stage() {
        LOG.debug("Constructor without argument");
    }

    public static Stage getInstance() {
        LOG.debug("Get stage");
        return StageSingletonHolder.instance;
    }

    private static class StageSingletonHolder {
        static Stage instance = new Stage();
    }
}
