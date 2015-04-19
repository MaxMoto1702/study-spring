package com.rstyle.maxmoto1702.gallery.services;

import com.rstyle.maxmoto1702.gallery.dao.PictureDao;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
@Component
public class PictureService {

    private static List<Picture> pictures;

    @Autowired
    private
    @Setter
    PictureDao pictureDao;

    public List<Picture> getAllPictures() {
        pictures = pictureDao.getAll();
        return pictures;
    }

    public Picture getPicture(Long pictureId) throws Exception {
        for (Picture picture : pictures) {
            if (picture.getId() == pictureId) {
                return picture;
            }
        }
        throw new Exception("Not found picture");
    }
}
