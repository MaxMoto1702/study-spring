package com.rstyle.maxmoto1702;

import org.junit.Test;

public class SimpleTest {

    @Test
    public void testMethod() {
        assertThat(new Main().method(), is(0));
    }
}