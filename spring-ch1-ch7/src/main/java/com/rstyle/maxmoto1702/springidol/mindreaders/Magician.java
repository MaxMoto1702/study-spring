package com.rstyle.maxmoto1702.springidol.mindreaders;

import com.rstyle.maxmoto1702.springidol.MindReader;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 05.04.2015.
 */
@Aspect
public class Magician implements MindReader {

    private static final Logger LOG = LoggerFactory.getLogger(Magician.class);
    private String thoughts;

    @Pointcut("execution(* com.rstyle.maxmoto1702.springidol.Thinker.thinkOfSomething(String)) && args(thoughts)")
    public void thinking(String thoughts) {

    }

    @Before("thinking(thoughts)")
    @Override
    public void interceptThoughts(String thoughts) {
        LOG.info("Intercepting volunteer's thoughts");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
