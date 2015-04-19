package com.rstyle.maxmoto1702.springidol.contestants;

import com.rstyle.maxmoto1702.springidol.Contestant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 05.04.2015.
 */
public class GraciousContestant implements Contestant {

    private static final Logger LOG = LoggerFactory.getLogger(GraciousContestant.class);

    @Override
    public void receiveAward() {
        LOG.info("I'm receive award!!!");
    }
}
