package com.hbh.canndy.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharCandyReplaceUtil implements CandyUtil {
    //替换连续出现三次的字母
    public String changeStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 1;//替换次数
        while (true) {
            boolean modified = false;
            String temp = sb.toString();

            // 使用正则表达式匹配 3 个或更多连续相同的字符，并将其替换为空字符串
            StringBuilder result = new StringBuilder();
            for (String s : temp.split("(?<=(.))(?!\\1)")) {
                String string = s.length() >= 3 ? replaceChar(s) : s;
                result.append(string);
            }
            String replaced = result.toString();

            if (!replaced.equals(temp)) {
                modified = true;
                sb = new StringBuilder(replaced);
                System.out.println("第" + i + "次替换：" + sb);
                i++;
            }

            if (!modified) {
                break;
            }
        }

        return sb.toString();
    }

    // 替换字符，如果是连续三个a，则换为空字符串
    private static String replaceChar(String a) {
        if ("aaa".equals(a)) {
            return "";
        }
        return String.valueOf((char) (a.charAt(0) - 1));
    }
}
