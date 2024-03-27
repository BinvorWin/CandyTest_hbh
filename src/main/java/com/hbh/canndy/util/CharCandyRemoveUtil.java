package com.hbh.canndy.util;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharCandyRemoveUtil implements CandyUtil {
    //移除连续出现三次的字母
    public String changeStr(String str) {
        StringBuilder sb = new StringBuilder(str);
        int i = 1;//移除次数
        System.out.println("开始消除重复字符串：" + str);

        while (true) {
            boolean modified = false;
            String temp = sb.toString();

            // 使用正则表达式匹配 3 个或更多连续相同的字符，并将其替换为空字符串
            String replaced = Stream.of(temp.split("(?<=(.))(?!\\1)"))
                    .map(s -> s.length() >= 3 ? "" : s)
                    .collect(Collectors.joining());

            if (!replaced.equals(temp)) {
                modified = true;
                sb = new StringBuilder(replaced);
                System.out.println("第" + i + "次移除：" + sb);
                i++;
            }

            if (!modified) {
                break;
            }
        }
        System.out.println("字符串:"+str + ",消除重复字符串后的结果：" + sb);

        return sb.toString();
    }

}
