package com.rstyle.maxmoto1702.springmvc.controllers;

import com.rstyle.maxmoto1702.springmvc.services.HelloService;
import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static com.rstyle.maxmoto1702.springmvc.controllers.HelloController.LANGUAGE;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.Mockito.*;

/**
 * Created by m on 19.04.2015.
 */
public class HomeControllerTest {

    @Test
    public void shouldDisplayHelloView() {
        String expectedMessage = "Hello World";
        HelloService helloService = mock(HelloService.class);

        when(helloService.getHelloMessage(LANGUAGE)).thenReturn(expectedMessage);

        HelloController helloController = new HelloController(helloService);

        Map<String, Object> model = new HashMap<>();

        String view = helloController.showHelloPage(model);

        assertThat("Возвращена не верное представление", view, is("hello"));
        assertThat("В модели отсутствует сообщение", model.keySet(), CoreMatchers.hasItem("message"));
        assertThat("Неверное сообщение", (String) model.get("message"), is(expectedMessage));
        verify(helloService).getHelloMessage(LANGUAGE);
    }
}
