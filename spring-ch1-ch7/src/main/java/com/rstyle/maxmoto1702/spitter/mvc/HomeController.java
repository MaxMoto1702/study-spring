package com.rstyle.maxmoto1702.spitter.mvc;

import com.rstyle.maxmoto1702.spitter.SpitterService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.inject.Inject;
import java.util.Map;

/**
 * Created by m on 13.04.2015.
 */
@Controller
public class HomeController {

    public static final int DEFAULT_SPITTLES_PER_PAGE = 25;

    private SpitterService spitterService;

    // Внедрить SpitterService
    @Inject
    public HomeController(SpitterService spitterService) {
        this.spitterService = spitterService;
    }

    // Обрабатывать запросы на получение главной страницы
    @RequestMapping({"/", "/home"})
    public String showHomePage(Map<String, Object> model) {
        //Добавить сообщения в модель
        model.put("spittles", spitterService.getRecentSpittles(DEFAULT_SPITTLES_PER_PAGE));
        // Вернуть имя представления
        return "home";
    }
}
