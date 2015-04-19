package com.rstyle.maxmoto1702.knights;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by maksim.serebryanskiy on 02.04.2015.
 */
public class KnightMain {

    public static void main(String[] args) throws QuestException {
        // Загрузка контекста Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("knights.xml");

        // Получение компонента knight
        Knight knight = (Knight) context.getBean("knight");

        // Использование компонента knight
        knight.embarkOnQuest();
    }
}
