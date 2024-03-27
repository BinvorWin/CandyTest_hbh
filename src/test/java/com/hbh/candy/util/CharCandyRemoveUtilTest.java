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
        assertEquals("测试", charCandyRemoveUtil.changeStr("测试"));
        assertEquals("试", charCandyRemoveUtil.changeStr("测测测测试"));
        assertEquals("!", charCandyRemoveUtil.changeStr("!..."));
        assertEquals(".", charCandyRemoveUtil.changeStr("."));
        assertEquals("A", charCandyRemoveUtil.changeStr("ABBB"));



    }
}
