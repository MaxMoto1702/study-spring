package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Instrumentalist implements Performer {

    private static final Logger LOG = LoggerFactory.getLogger(Instrumentalist.class);
    
    private String song;
    private Instrument instrument;

    public Instrumentalist() {
        LOG.debug("Constructor without argument");
    }

    @Override
    public void perform() throws PerformanceException {
        LOG.info("Playing '" + song + "'");
        instrument.play();
    }

    public String getSong() {
        LOG.debug("Get song");
        return song;
    }

    public String screamSong() {
        LOG.debug("Scream song");
        return null;
    }

    public void setSong(String song) {
        LOG.debug("Set song");
        this.song = song;
    }

    public Instrument getInstrument() {
        LOG.debug("Get instrument");
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        LOG.debug("Set instrument");
        this.instrument = instrument;
    }
}
