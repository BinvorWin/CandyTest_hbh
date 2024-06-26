package com.hbh.canndy.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharCandyReplaceUtil implements CandyUtil {
    //替换连续出现三次的字母
    public String changeStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 1;//替换次数
        System.out.println("开始替换字母连续重复3次的字符串：" + str);

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
        System.out.println("字符串:"+str + ",替换字符串后的结果：" + sb);

        return sb.toString();
    }

    // 替换字符，如果是连续三个a，则换为空字符串，如果不是字母则不处理
    private static String replaceChar(String a) {
        if ("aaa".equals(a)) {
            System.out.println(a + "字母a前面无其他字母，移除");
            return "";
        }
        if (!a.matches("^[A-Za-z]+$")) {
            System.out.println(a + "不是字母，不需要处理");
            return a;
        }
        return String.valueOf((char) (a.charAt(0) - 1));
    }
}
