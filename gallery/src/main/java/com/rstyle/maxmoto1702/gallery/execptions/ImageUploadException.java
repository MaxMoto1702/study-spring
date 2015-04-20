package com.rstyle.maxmoto1702.gallery.execptions;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by maksim.serebryanskiy on 20.04.2015.
 */
public class ImageUploadException extends Exception {

    private static final Logger LOG = LoggerFactory.getLogger(ImageUploadException.class);

    public ImageUploadException(String message) {
        super(message);
    }

    public ImageUploadException(String message, IOException e) {
        super(message, e);
    }
}
