package com.rstyle.maxmoto1702.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class SpringIdolMain {
    
    public static void main(String[] args) throws PerformanceException {
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");
        
        // Получение компонента duke
        Performer duke = (Performer) context.getBean("duke");
        Performer kenny = (Performer) context.getBean("kenny");
        Performer max = (Performer) context.getBean("max");
        Performer hank = (Performer) context.getBean("hank");

        Ticket ticket1 = (Ticket) context.getBean("ticket");
        Ticket ticket2 = (Ticket) context.getBean("ticket");

        // Использование компонента duke
        duke.perform();
        kenny.perform();
        max.perform();
        hank.perform();
    }
}
