package com.kharitonov.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    void isPositiveNumber() {
        boolean actual = StringUtils.isPositiveNumber("225");
        assertTrue(actual);
    }
}