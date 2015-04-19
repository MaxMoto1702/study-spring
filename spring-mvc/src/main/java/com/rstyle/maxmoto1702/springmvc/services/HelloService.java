package com.rstyle.maxmoto1702.springmvc.services;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by m on 19.04.2015.
 */
@Component
public class HelloService {

    private static Map<String, String> helloMessages;

    static {
        helloMessages = new HashMap<>();
        helloMessages.put("ru_RU", "Привет, Мир!!!");
    }

    public String getHelloMessage(String language) {
        return helloMessages.get(language);
    }
}
