package com.rstyle.maxmoto1702.gallery.controllers;

import com.rstyle.maxmoto1702.gallery.services.PictureService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by m on 19.04.2015.
 */
@Controller
public class PictureController {

    @Autowired
    @Setter
    private PictureService pictureService;

    @RequestMapping({"/", "/gallery"})
    public ModelAndView gallery() {
        ModelAndView mv = new ModelAndView("gallery");
        mv.addObject("pictures", pictureService.getAllPictures());
        return mv;
    }

    @RequestMapping("/gallery/view/{pictureId}")
    public ModelAndView view(@PathVariable String pictureId) throws Exception {
        ModelAndView mv = new ModelAndView("gallery-view");
        mv.addObject("picture", pictureService.getPicture(Long.parseLong(pictureId)));
        return mv;
    }
}
