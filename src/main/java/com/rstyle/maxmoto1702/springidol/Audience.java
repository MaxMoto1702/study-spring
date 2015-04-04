package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 04.04.2015.
 */
public class Audience {

    private static final Logger LOG = LoggerFactory.getLogger(Audience.class);

    public void takeSeats() {
        LOG.info("The audience is taking their seats.");
    }

    public void turnOffCellPhones() {
        LOG.info("The audience is turning off their cellphones");
    }

    public void applaud() {
        LOG.info("CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() {
        LOG.info("Boo! We want our money back!");
    }
}
