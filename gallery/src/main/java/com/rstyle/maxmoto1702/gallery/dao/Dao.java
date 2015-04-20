package com.rstyle.maxmoto1702.gallery.dao;

import com.rstyle.maxmoto1702.gallery.models.Picture;

import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
interface Dao<T> {

    List<T> getAll();

    void insert(T object);

    void update(T object);

    void delete(T object);

    T getById(Long id);
}
