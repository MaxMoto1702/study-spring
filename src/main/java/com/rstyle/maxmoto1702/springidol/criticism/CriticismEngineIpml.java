package com.rstyle.maxmoto1702.springidol.criticism;

import com.rstyle.maxmoto1702.springidol.CriticismEngine;

/**
 * Created by m on 05.04.2015.
 */
public class CriticismEngineIpml implements CriticismEngine {

    private String[] criticismPool;

    @Override
    public String getCriticism() {
        return criticismPool[(int) Math.random() * criticismPool.length];
    }

    public void setCriticismPool(String[] criticismPool) {
        this.criticismPool = criticismPool;
    }
}
