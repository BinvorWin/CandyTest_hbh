package com.hbh.candy.util;

import com.hbh.canndy.util.CharCandyRemoveUtil;
import com.hbh.canndy.util.CharCandyReplaceUtil;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharCandyReplaceUtilTest {

    @Test
    public void testReplaceCharacters() {
        CharCandyReplaceUtil charCandyReplaceUtil = new CharCandyReplaceUtil();
        assertEquals("d", charCandyReplaceUtil.changeStr("abcccbad"));
        assertEquals("abad", charCandyReplaceUtil.changeStr("acccad"));
        assertEquals("abc", charCandyReplaceUtil.changeStr("abc"));
        assertEquals("测试", charCandyReplaceUtil.changeStr("测试"));
        assertEquals("测测测", charCandyReplaceUtil.changeStr("测测测"));
        assertEquals(".", charCandyReplaceUtil.changeStr("."));
        assertEquals("...!", charCandyReplaceUtil.changeStr("...!"));
        assertEquals("aaAd", charCandyReplaceUtil.changeStr("abbbAd"));

    }
}
