package com.hbh.candy.util.factory;

import com.hbh.canndy.util.CharCandyRemoveUtil;
import com.hbh.canndy.util.CharCandyReplaceUtil;
import com.hbh.canndy.util.factory.CandyUtilFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

public class CandyUtilFactoryTest {

    CandyUtilFactory candyUtilFactory;

    @Before
    public void initTest() {
        this.candyUtilFactory = new CandyUtilFactory();
    }

    @Test
    public void whenTypeIsReplaceShouldReturnTure() {
        //Given
        String type = "REPLACE";
        Assert.assertTrue(candyUtilFactory.getCandyUtil(type) instanceof CharCandyReplaceUtil);
    }

    @Test
    public void whenTypeIsRemoveShouldReturnTure() {
        //Given
        String type = "REMOVE";
        Assert.assertTrue(candyUtilFactory.getCandyUtil(type) instanceof CharCandyRemoveUtil);
    }

    @Test
    public void whenNoTypeShouldReturnException() {
        //Given
        String type = "ADD";
        Assert.assertThrows(NoSuchElementException.class, () -> candyUtilFactory.getCandyUtil(type));
    }
}
