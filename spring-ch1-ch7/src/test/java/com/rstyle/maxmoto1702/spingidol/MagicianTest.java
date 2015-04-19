package com.rstyle.maxmoto1702.spingidol;

import com.rstyle.maxmoto1702.springidol.MindReader;
import com.rstyle.maxmoto1702.springidol.Thinker;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by m on 05.04.2015.
 */
public class MagicianTest {

    private Thinker volunteer;
    private MindReader magician;

    @Before
    public void setUp() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-idol.xml");

        volunteer = (Thinker) context.getBean("volunteer");
        magician = (MindReader) context.getBean("magician");
    }

    @Test
    public void magicianShouldReadVolunteersMind() {
        volunteer.thinkOfSomething("Mind of volunteer");
        assertEquals("Mind of volunteer", magician.getThoughts());
    }
}
