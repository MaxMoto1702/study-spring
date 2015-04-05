package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 05.04.2015.
 */
public aspect JudgeAspect {

    public static final Logger LOG = LoggerFactory.getLogger(JudgeAspect.class);
    private CriticismEngine criticismEngine;

    public JudgeAspect() {
    }

    pointcut perfomance(): execution(* perform(..));

    after(): returing() : perfomance() {
        LOG.info(criticismEngine.getCriticism());
    }

    public CriticismEngine getCriticismEngine() {
        return criticismEngine;
    }

    public void setCriticismEngine(CriticismEngine criticismEngine) {
        this.criticismEngine = criticismEngine;
    }
}
