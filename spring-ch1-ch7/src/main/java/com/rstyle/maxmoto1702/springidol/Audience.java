package com.rstyle.maxmoto1702.springidol;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by m on 04.04.2015.
 */
@Aspect
public class Audience {

    private static final Logger LOG = LoggerFactory.getLogger(Audience.class);

    @Pointcut("execution(* com.rstyle.maxmoto1702.springidol.Performer.perform(..))")
    public void perfomance() {

    }

//    @Before("perfomance()")
//    public void takeSeats() {
//        LOG.info("The audience is taking their seats.");
//    }
//
//    @Before("perfomance()")
//    public void turnOffCellPhones() {
//        LOG.info("The audience is turning off their cellphones");
//    }
//
//    @AfterReturning("perfomance()")
//    public void applaud() {
//        LOG.info("CLAP CLAP CLAP CLAP CLAP");
//    }
//
//    @AfterThrowing("perfomance()")
//    public void demandRefund() {
//        LOG.info("Boo! We want our money back!");
//    }

    @Around("perfomance()")
    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            LOG.info("The audience is taking their seats.");
            LOG.info("The audience is turning off their cellphones");
            long start = System.currentTimeMillis();
            joinPoint.proceed();
            long end = System.currentTimeMillis();
            LOG.info("CLAP CLAP CLAP CLAP CLAP");
            LOG.info("The performance took " + (end - start) + " milliseconds.");
        } catch (Throwable t) {
            LOG.error("Boo! We want our money back! [ " + t.getClass().toString() + " ]");
        }
    }
}
