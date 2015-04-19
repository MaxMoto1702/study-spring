package com.rstyle.maxmoto1702.springidol.contestants;

import com.rstyle.maxmoto1702.springidol.Contestant;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

/**
 * Created by m on 05.04.2015.
 */
@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "com.rstyle.maxmoto1702.springidol.Performer+",
            defaultImpl = GraciousContestant.class
    )
    public static Contestant contestant;
}
