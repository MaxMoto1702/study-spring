package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class Ticket {

    private static final Logger LOG = LoggerFactory.getLogger(Ticket.class);
    private static int ticketCount = 0;
    private int ticketNumber;

    public Ticket() {
        LOG.debug("Constructor without argument");
        this.ticketNumber = ticketCount++;
        LOG.info("Ticket number " + ticketNumber);
    }
}
