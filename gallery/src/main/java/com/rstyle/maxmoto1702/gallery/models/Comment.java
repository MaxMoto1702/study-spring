package com.rstyle.maxmoto1702.gallery.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * Created by m on 19.04.2015.
 */
@Slf4j
@Data
public class Comment {

    private Long id;
    private Long pictureId;
    private String text;
    private Date createDate;
    private Date editDate;
    private Client client;
}
