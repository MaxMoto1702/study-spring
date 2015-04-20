package com.rstyle.maxmoto1702.gallery.services;

import com.rstyle.maxmoto1702.gallery.dao.PictureDao;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
@Component
public class PictureService {

    private static final Logger LOG = LoggerFactory.getLogger(PictureService.class);

    private static List<Picture> pictures;

    @Autowired
    @Setter
    private PictureDao pictureDao;

    public List<Picture> getAllPictures() {
        pictures = pictureDao.getAll();
        return pictures;
    }

    public Picture getPicture(Long pictureId) throws Exception {
        LOG.debug("Picture ID: " + pictureId);
        Picture picture = pictureDao.getById(pictureId);
        return picture;
    }

    public void add(Picture picture) {
        pictureDao.insert(picture);
    }

    public void save(Picture picture) {
        pictureDao.update(picture);
    }

    public void delete(Picture picture) {
        pictureDao.delete(picture);
    }
}
