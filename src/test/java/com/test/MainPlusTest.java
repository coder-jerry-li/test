package com.test;

import org.junit.Assert;
import org.junit.Test;

public class MainPlusTest {
    @Test
    public void dealString3() {

        //source string is null
        String testCase = null;
        String result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("",result);

        //The string length is less than 3
        testCase = "aa";
        result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("aa",result);

        //The string length equals 3 and three characters are same
        testCase = "aaa";
        result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("",result);

        //The string length equals 3 and three characters are not same
        testCase = "abc";
        result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("abc",result);

        //Three same characters are replaced by the blank character
        testCase = "aabbbc";
        result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("aac",result);

        //secondary replacement
        testCase = "aabbbac";
        result = MainPlus.dealString3(testCase,3);
        Assert.assertEquals("c",result);

    }
    @Test
    public void dealString4() {

        //source string is null
        String testCase = null;
        String result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("",result);

        //The string length is less than 3
        testCase = "aa";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("aa",result);

        //The string length equals 3 and three characters are same
        testCase = "aaa";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("",result);

        //The string length equals 3 and three characters are not same
        testCase = "abc";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("abc",result);

        //Three same characters are replaced by the other character
        testCase = "aacccd";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("aabd",result);


        //secondary replacement
        testCase = "aabbbc";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("c",result);

        //secondary replacement and the 'a' is deleted
        testCase = "aabbbac";
        result = MainPlus.dealString4(testCase,3);
        Assert.assertEquals("ac",result);
    }
}
