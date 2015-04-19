package com.rstyle.maxmoto1702.gallery.validators;

import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by m on 19.04.2015.
 */
public class PictureValidator implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Picture.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        // Логика валициия данных с формы
    }
}
