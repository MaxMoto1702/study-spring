package com.rstyle.maxmoto1702.gallery.models;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by m on 19.04.2015.
 */
@Slf4j
@Data
public class Client {

    private Long id;
    private String fullName;
    private String email;
    private String phone;
}
