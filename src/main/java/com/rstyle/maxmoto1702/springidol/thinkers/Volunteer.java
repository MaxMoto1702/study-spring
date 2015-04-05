package com.rstyle.maxmoto1702.springidol.thinkers;

import com.rstyle.maxmoto1702.springidol.Thinker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 05.04.2015.
 */
public class Volunteer implements Thinker {

    private static final Logger LOG = LoggerFactory.getLogger(Volunteer.class);

    @Override
    public void thinkOfSomething(String thoughts) {
        LOG.info(thoughts);
    }
}
