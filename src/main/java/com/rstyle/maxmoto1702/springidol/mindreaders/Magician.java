package com.rstyle.maxmoto1702.springidol.mindreaders;

import com.rstyle.maxmoto1702.springidol.MindReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 05.04.2015.
 */
public class Magician implements MindReader {

    private static final Logger LOG = LoggerFactory.getLogger(Magician.class);
    private String thoughts;

    @Override
    public void interceptThoughts(String thought) {
        LOG.info("Intercepting volunteer's thoughts");
        this.thoughts = thought;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
