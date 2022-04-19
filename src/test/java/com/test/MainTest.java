package com.test;


import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void dealString1() {

        //source string is null
        String testCase = null;
        String result = Main.dealString1(testCase);
        Assert.assertEquals("",result);

        //The string length is less than 3
        testCase = "aa";
        result = Main.dealString1(testCase);
        Assert.assertEquals("aa",result);

        //The string length equals 3 and three characters are same
        testCase = "aaa";
        result = Main.dealString1(testCase);
        Assert.assertEquals("",result);

        //The string length equals 3 and three characters are not same
        testCase = "abc";
        result = Main.dealString1(testCase);
        Assert.assertEquals("abc",result);

        //Three same characters are replaced by the blank character
        testCase = "aabbbc";
        result = Main.dealString1(testCase);
        Assert.assertEquals("aac",result);

        //secondary replacement
        testCase = "aabbbac";
        result = Main.dealString1(testCase);
        Assert.assertEquals("c",result);

    }
    @Test
    public void dealString2() {

        //source string is null
        String testCase = null;
        String result = Main.dealString2(testCase);
        Assert.assertEquals("",result);

        //The string length is less than 3
        testCase = "aa";
        result = Main.dealString2(testCase);
        Assert.assertEquals("aa",result);

        //The string length equals 3 and three characters are same
        testCase = "aaa";
        result = Main.dealString2(testCase);
        Assert.assertEquals("",result);

        //The string length equals 3 and three characters are not same
        testCase = "abc";
        result = Main.dealString2(testCase);
        Assert.assertEquals("abc",result);

        //Three same characters are replaced by the other character
        testCase = "aacccd";
        result = Main.dealString2(testCase);
        Assert.assertEquals("aabd",result);


        //secondary replacement
        testCase = "aabbbc";
        result = Main.dealString2(testCase);
        Assert.assertEquals("c",result);

        //secondary replacement and the 'a' is deleted
        testCase = "aabbbac";
        result = Main.dealString2(testCase);
        Assert.assertEquals("ac",result);
    }
}