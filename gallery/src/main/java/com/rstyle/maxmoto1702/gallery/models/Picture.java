package com.rstyle.maxmoto1702.gallery.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;
import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
@Slf4j
@Data
public class Picture {

    private Long id;
    private String name;
    private String description;
    private Date createDate;
    private Date editDate;
    private String thumbPath;
    private String filePath;
    private List<Comment> comments;
}
