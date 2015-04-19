package com.rstyle.maxmoto1702.gallery.dao;

import java.util.List;

/**
 * Created by m on 19.04.2015.
 */
interface Dao<T> {

    List<T> getAll();

    void insert(T object);

    void update(T object);

    void delete(T object);
}
