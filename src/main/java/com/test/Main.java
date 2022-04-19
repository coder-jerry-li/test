package com.test;

import java.util.Optional;

public class Main {
    public static String dealString1(String srcString) {
        Optional<String> optional = Optional.ofNullable(srcString);
        if (!optional.isPresent()) return "";
        StringBuilder sb = new StringBuilder(srcString);
        for (int i = 2; i < sb.length(); i++) {
            char char1 = sb.charAt(i - 2);
            char char2 = sb.charAt(i - 1);
            char char3 = sb.charAt(i);
            if (char3 == char2 && char2 == char1) {
                sb.delete(i - 2, i + 1);
//                System.out.println(sb.toString());
                return dealString1(sb.toString());
            }
        }
        return sb.toString();
    }

    public static String dealString2(String srcString) {
        Optional<String> optional = Optional.ofNullable(srcString);
        if (!optional.isPresent()) return "";
        StringBuilder sb = new StringBuilder(srcString);
        for (int i = 2; i < sb.length(); i++) {
            char char1 = sb.charAt(i - 2);
            char char2 = sb.charAt(i - 1);
            char char3 = sb.charAt(i);
            if (char3 == char2 && char2 == char1) {
                if (char3 == 'a') {
                    sb.delete(i - 2, i + 1);
//                    System.out.println(sb.toString());
                } else {
                    char newChar = (char) (char1 - 1);
                    sb.replace(i - 2, i + 1, new String(new char[]{newChar}));
                }
                return dealString2(sb.toString());
            }
        }
        return sb.toString();
    }
}