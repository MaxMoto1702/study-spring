package com.rstyle.maxmoto1702.springmvc.controllers;

import com.rstyle.maxmoto1702.springmvc.services.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by m on 19.04.2015.
 */
@Controller
public class HelloController {

    public static final String LANGUAGE = "ru_RU";
    private final HelloService helloService;

    @Inject
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping({"/", "/hello"})
    public String showHelloPage(Map<String, Object> model) {
        model.put("message", helloService.getHelloMessage(LANGUAGE));
        return "hello";
    }
}
