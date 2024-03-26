package com.hbh.candy.util;

import com.hbh.canndy.util.CharCandyRemoveUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharCandyRemoveUtilTest {

    @Test
    public void testRemoveCharacters() {
        CharCandyRemoveUtil charCandyRemoveUtil = new CharCandyRemoveUtil();
        assertEquals("d", charCandyRemoveUtil.changeStr("aabcccbbad"));
        assertEquals("d", charCandyRemoveUtil.changeStr("aaad"));
        assertEquals("abc", charCandyRemoveUtil.changeStr("abc"));
    }
}
