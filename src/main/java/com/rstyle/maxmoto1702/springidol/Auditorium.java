package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Auditorium {

    private static final Logger LOG = LoggerFactory.getLogger(Auditorium.class);
    
    public void turnOnLights() {
        LOG.info("Turn on lights");
    }
    
    public void turnOffLights() {
        LOG.info("Turn off lights");
    }
}
