package com.qcshop.user.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChineseAndUnicodeTest {
    public static void main(String[] args) {

        String c = "\\u4e2d\\u6587";
        System.out.println(unicodeToChinese(c));
        System.out.println(chineseToUnicode("中文"));

        String pattern = "[\\u4e00-\\u9fa5]+";
        Pattern p = Pattern.compile(pattern);

        Matcher m = p.matcher("123中文sfsdf测试");
        System.out.println("---------");
        while (m.find()){
            System.out.println(m.group(0));
        }
    }

    public static String chineseToUnicode(final String chinese){
        char[] chineseBytes = chinese.toCharArray();
        final StringBuilder unicodeBytes = new StringBuilder();
        for (char chineseByte : chineseBytes) {
            String hex = Integer.toHexString(chineseByte);
            if (hex.length() <= 2) {
                hex = "00" + hex;
            }
            unicodeBytes.append("\\u").append(hex);
        }
        return unicodeBytes.toString();
    }

    public static String unicodeToChinese(final String unicodeStr){
        int start = 0;
        int end;
        final StringBuilder result = new StringBuilder();
        while (start > -1) {
            end = unicodeStr.indexOf("\\u", start+2);
            String charStr = "";
            if (end == -1) {
                charStr = unicodeStr.substring(start+2);
            }else{
                charStr = unicodeStr.substring(start+2, end);
            }
            char letter = (char)Integer.parseInt(charStr, 16);
            result.append(letter);
            start = end;
        }
        return result.toString();
    }
}
