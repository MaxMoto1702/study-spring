package com.rstyle.maxmoto1702.gallery.controllers;

import com.rstyle.maxmoto1702.gallery.execptions.ImageUploadException;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import com.rstyle.maxmoto1702.gallery.services.PictureService;
import lombok.Setter;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.io.File;
import java.io.IOException;


/**
 * Created by m on 19.04.2015.
 */
@Controller
public class PictureController {
    
    private static final Logger LOGGER = LoggerFactory.getLogger(PictureController.class);

    @Autowired
    @Setter
    private PictureService pictureService;
    private String webRootPath = "src/main/webapp";

    @RequestMapping({"/", "/gallery"})
    public ModelAndView gallery() {
        ModelAndView mv = new ModelAndView("gallery");
        mv.addObject("pictures", pictureService.getAllPictures());
        return mv;
    }

    @RequestMapping("/gallery/view/{pictureId}")
    public ModelAndView view(@PathVariable String pictureId) throws Exception {
        LOGGER.debug("Picture ID: " + pictureId);
        ModelAndView mv = new ModelAndView("gallery-view");
        mv.addObject("picture", pictureService.getPicture(Long.parseLong(pictureId)));
        return mv;
    }
    
    @RequestMapping(value = "/gallery/add", method = RequestMethod.GET)
    public ModelAndView add() {
        ModelAndView mv = new ModelAndView("gallery-add");
        mv.addObject(new Picture());
        return mv;
    }
    
    @RequestMapping(value = "/gallery/add", method = RequestMethod.POST)
    public ModelAndView addFromForm(
            @Valid 
            Picture picture, 
            BindingResult bindingResult, 
            @RequestParam(value="image", required=false)
            MultipartFile image
    ) {
        LOGGER.debug("" + picture);
        if (bindingResult.hasErrors()) {
            LOGGER.warn("User create error");
            ModelAndView mv = new ModelAndView("gallery-add");
            mv.addObject(picture);
            return mv;
        }
        
        picture.setThumbPath("");
        picture.setFilePath("");
        
        pictureService.add(picture);
        
        try {
            if (!image.isEmpty()) {
                validateImage(image);
                saveImage(picture.getId() + ".jpg", image);
                picture.setThumbPath("/resources/images/thumbs/" + picture.getId() + ".jpg");
                picture.setFilePath("/resources/images/" + picture.getId() + ".jpg");
                pictureService.save(picture);
            }
        } catch (ImageUploadException e) {
            bindingResult.reject(e.getMessage());
            ModelAndView mv = new ModelAndView("gallery-add");
            pictureService.delete(picture);
            mv.addObject(picture);
            return mv;
        }
        ModelAndView mv = new ModelAndView("redirect:/gallery/view/" + picture.getId());
        mv.addObject("picture", picture);
        return mv;
    }

    private void validateImage(MultipartFile image) throws ImageUploadException {
        if(!image.getContentType().equals("image/jpeg")) {
            throw new ImageUploadException("Only JPG images accepted");
        }
    }

    private void saveImage(String filename, MultipartFile image) throws ImageUploadException {
        try {
            File thumbs = new File(webRootPath + "/resources/images/thumbs/" + filename);
            File file = new File(webRootPath + "/resources/images/" + filename);
            FileUtils.writeByteArrayToFile(thumbs, image.getBytes());
            FileUtils.writeByteArrayToFile(file, image.getBytes());
        } catch (IOException e) {
            throw new ImageUploadException("Unable to save image", e);
        }
    }
}
