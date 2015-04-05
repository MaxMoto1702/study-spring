package com.rstyle.maxmoto1702.springidol.performers;

import com.rstyle.maxmoto1702.springidol.PerformanceException;
import com.rstyle.maxmoto1702.springidol.Poem;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class PoeticJuggler extends Juggler {

    private static final Logger LOG = LoggerFactory.getLogger(PoeticJuggler.class);
    
    private Poem poem;

    public PoeticJuggler(Poem poem) {
        LOG.debug("Constructor with poem");
        this.poem = poem;
    }

    public PoeticJuggler(int beanBags, Poem poem) {
        super(beanBags);
        LOG.debug("Constructor with bean bags and poem");
        this.poem = poem;
    }

    @Override
    public void perform() throws PerformanceException {
        super.perform();
        LOG.info("While reciting...");
        poem.recite();
    }
}
