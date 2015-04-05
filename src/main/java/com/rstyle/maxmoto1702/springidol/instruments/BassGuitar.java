package com.rstyle.maxmoto1702.springidol.instruments;

import com.rstyle.maxmoto1702.springidol.Instrument;
import com.rstyle.maxmoto1702.springidol.PerformanceException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class BassGuitar implements Instrument {

    private static final Logger LOG = LoggerFactory.getLogger(BassGuitar.class);

    @Override
    public void play() throws PerformanceException {
        LOG.info("Play on bass guitar");
        throw new PerformanceException();
    }
}
