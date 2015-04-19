package com.rstyle.maxmoto1702.springidol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class SpringIdolMain {

    private static final Logger LOG = LoggerFactory.getLogger(SpringIdolMain.class);

    public static void main(String[] args) {
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

        // Получение компонента duke
        Performer duke = (Performer) context.getBean("duke");
        Performer kenny = (Performer) context.getBean("kenny");
        Performer max = (Performer) context.getBean("max");
        Performer hank = (Performer) context.getBean("hank");
        MindReader magician = (MindReader) context.getBean("magician");
        Thinker volunteer = (Thinker) context.getBean("volunteer");

        Ticket ticket1 = (Ticket) context.getBean("ticket");
        Ticket ticket2 = (Ticket) context.getBean("ticket");

        // Использование компонента duke
        try {
            duke.perform();
            ((Contestant) duke).receiveAward();
            kenny.perform();
            max.perform();
            hank.perform();
        } catch (PerformanceException e) {
            LOG.error("PerformanceException", e);
        }
        volunteer.thinkOfSomething("It's volunteer's thoughts");
        LOG.info("Magician read: '" + magician.getThoughts() + "'");
    }
}
