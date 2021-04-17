package easy;

import java.security.PrivateKey;
import java.util.List;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 */

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs){
        if (strs==null || strs.length==0) return "";
        String re = strs[0];
        for (int x=1; x<strs.length; x++){
            if (re.equals("")) return re;
            int min = Math.min(re.length(), strs[x].length());
            int index = 0;
            for (int y=0; y<min; y++){
                if (re.charAt(y)!=strs[x].charAt(y)){
                    break;
                }
                index++;
            }
            re = strs[x].substring(0, index);
        }
        return re;
    }

    public static void main(String[] args) {
        String[] strs1 = new String[]{"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs1));
        String[] strs2 = new String[]{"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs2));
    }
}
