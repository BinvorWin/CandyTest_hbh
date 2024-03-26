package com.hbh.canndy.util.factory;

import com.hbh.canndy.util.CandyUtil;
import com.hbh.canndy.util.CharCandyRemoveUtil;
import com.hbh.canndy.util.CharCandyReplaceUtil;

import java.util.NoSuchElementException;

public class CandyUtilFactory {
    private final static String REPLACE = "REPLACE";
    private final static String REMOVE = "REMOVE";

    public CandyUtil getCandyUtil(String type) {
        if (REPLACE.equals(type)) {
            return new CharCandyReplaceUtil();
        } else if (REMOVE.equals(type)) {
            return new CharCandyRemoveUtil();
        } else {
            throw new NoSuchElementException("the type for" + type + "not implement ");
        }

    }
}
