package com.rstyle.maxmoto1702.springidol.performers;

import com.rstyle.maxmoto1702.springidol.PerformanceException;
import com.rstyle.maxmoto1702.springidol.Performer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Juggler implements Performer {
    
    private static final Logger LOG = LoggerFactory.getLogger(Juggler.class);
    
    private int beanBags = 3;

    public Juggler() {
        LOG.debug("Constructor without arguments");
    }

    public Juggler(int beanBags) {
        LOG.debug("Constructor with bean bags");
        this.beanBags = beanBags;
    }

    @Override
    public void perform() throws PerformanceException {
        LOG.info("JUGGLING " + beanBags + " BEANBAGS");
    }
}
