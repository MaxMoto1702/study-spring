package com.rstyle.maxmoto1702.spitter.persistence;

import com.rstyle.maxmoto1702.spitter.domain.Spitter;

/**
 * Created by m on 05.04.2015.
 */
public interface SpitterDAO {

    void addSpitter(Spitter spitter);

    Spitter getSpitterById(long id);
}
