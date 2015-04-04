package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Guitar implements Instrument {

    private static final Logger LOG = LoggerFactory.getLogger(Guitar.class);

    @Override
    public void play() {
        LOG.info("Play on guitar");
    }
}
