package com.rstyle.maxmoto1702.gallery.models;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by m on 19.04.2015.
 */
public class PictureTest {

    private Long expectedId = 10L;
    private String expectedName = "Expected name";

    @Test
    public void testGetterSetter() {
        Picture picture = new Picture();
        picture.setId(expectedId);
        picture.setName(expectedName);

        assertThat("�������� ��", picture.getId(), is(expectedId));
        assertThat("", picture.getName(), is(expectedName));
    }
}
