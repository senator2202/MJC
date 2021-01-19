package com.kharitonov.utils;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

    private StringUtils(){}

    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && NumberUtils.createInteger(str) > 0;
    }
}
