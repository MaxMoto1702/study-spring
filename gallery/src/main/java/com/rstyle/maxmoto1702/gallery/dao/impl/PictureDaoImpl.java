package com.rstyle.maxmoto1702.gallery.dao.impl;

import com.rstyle.maxmoto1702.gallery.dao.PictureDao;
import com.rstyle.maxmoto1702.gallery.models.Client;
import com.rstyle.maxmoto1702.gallery.models.Comment;
import com.rstyle.maxmoto1702.gallery.models.Picture;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
@Component
public class PictureDaoImpl implements PictureDao {

    private static List<Picture> pictures;

    static {
        pictures = new ArrayList<Picture>();

        for (long pictureIndex = 0; pictureIndex < 5; pictureIndex++) {
            List<Comment> comments = new ArrayList<Comment>();
            for (long commentIndex = 0; commentIndex < 10; commentIndex++) {
                Client client = new Client();
                client.setId(0L);
                client.setFullName("Full Name");
                client.setEmail("e@mail.com");
                client.setPhone("1234567890");

                Comment comment = new Comment();
                comment.setId(commentIndex * pictureIndex);
                comment.setPictureId(pictureIndex);
                comment.setText("Text " + commentIndex * pictureIndex);
                comment.setCreateDate(new Date(System.currentTimeMillis()));
                comment.setEditDate(new Date(System.currentTimeMillis()));
                comment.setClient(client);

                comments.add(comment);
            }
            Picture picture = new Picture();
            picture.setId(pictureIndex);
            picture.setName("Name " + pictureIndex);
            picture.setDescription("Description " + pictureIndex);
            picture.setCreateDate(new Date(System.currentTimeMillis()));
            picture.setEditDate(new Date(System.currentTimeMillis()));
            picture.setThumbPath("thumb" + pictureIndex);
            picture.setFilePath("file" + pictureIndex);
            picture.setComments(comments);
            pictures.add(picture);
        }
    }

    @Override
    public List<Picture> getAll() {
        return pictures;
    }

    @Override
    public void insert(Picture picture) {
        pictures.add(picture);
    }

    @Override
    public void update(Picture picture) {

    }

    @Override
    public void delete(Picture picture) {
        pictures.remove(picture);
    }
}
