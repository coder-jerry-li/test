package com.test;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainPlus {

    public static String dealString3(String srcString,int count) {
        Optional<String> optional = Optional.ofNullable(srcString);
        if (!optional.isPresent()) return "";
        StringBuilder sb = new StringBuilder(srcString);
        int length = srcString.length();
        int index = 0;
        while(index<=length-count){
            char[] charArray = sb.substring(index,index+count).toCharArray();
            List list = new String(charArray).chars().mapToObj(i ->(char) i).collect(Collectors.toList());
            if(list.stream().distinct().count()==1){//consecutive $count characters are the same
                sb.delete(index,index+count);
                return dealString3(sb.toString(), count);
            }
            index++;
        }
        return sb.toString();
    }

    public static String dealString4(String srcString,int count) {
        Optional<String> optional = Optional.ofNullable(srcString);
        if (!optional.isPresent()) return "";
        StringBuilder sb = new StringBuilder(srcString);
        int length = srcString.length();
        int index = 0;
        while(index<=length-count){
            char[] charArray = sb.substring(index,index+count).toCharArray();
            List list = new String(charArray).chars().mapToObj(i ->(char) i).collect(Collectors.toList());
            if(list.stream().distinct().count()==1){//consecutive $count characters are the same
                char sameChar = sb.charAt(index);
                if(sameChar == 'a'){
                    sb.delete(index,index+count);
                }else{
                    char newChar = (char)(sameChar-1);
                    sb.replace(index,index+count,new String(new char[]{newChar}));
                }
                return dealString4(sb.toString(), count);
            }
            index++;
        }
        return sb.toString();
    }


}
