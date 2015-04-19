package com.rstyle.maxmoto1702.springidol.performers;

import com.rstyle.maxmoto1702.springidol.Instrument;
import com.rstyle.maxmoto1702.springidol.PerformanceException;
import com.rstyle.maxmoto1702.springidol.Performer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class OneManBand implements Performer {

    private static final Logger LOG = LoggerFactory.getLogger(OneManBand.class);

    private Collection<Instrument> instruments;

    public OneManBand() {
    }

    @Override
    public void perform() throws PerformanceException {
        LOG.info("Play on many instrument");
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }

    public Collection<Instrument> getInstruments() {
        return instruments;
    }

    public void setInstruments(Collection<Instrument> instruments) {
        this.instruments = instruments;
    }
}
