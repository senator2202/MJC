package com.epam.core;

import com.kharitonov.utils.StringUtils;

import java.util.Arrays;

public class Util {

    private Util() {
    }

    public static boolean isAllPositiveNumbers(String... str) {
       return Arrays.stream(str).allMatch(StringUtils::isPositiveNumber);
    }
}
