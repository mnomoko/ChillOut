package com.chillout.backend.ChillOut.tool;

/**
 * Created by mnomoko on 13/08/2017.
 */
public class Converter {

    public static long stringToLong(String id) {
        Long key = Long.valueOf(id);
        return key != null ? key : 0L;
    }
}
