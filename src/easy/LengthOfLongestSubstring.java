package easy;

import java.util.*;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */

public class LengthOfLongestSubstring {
    //滑动窗口解法
    public static int lengthOfLongestSubstring(String s) {
        Map<String, Integer> hashMap = new HashMap<>();
        int length = 0;
        int start = 0;
        for (int i=0; i<s.length(); i++){
            String ch = s.substring(i, i+1);
            if (hashMap.containsKey(ch)){
                start = Math.max(hashMap.get(ch)+1, start);
            }
            length = Math.max(length, i-start+1);
            hashMap.put(ch, i);
        }
        return length;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abbbbbaaaa"));
        System.out.println(lengthOfLongestSubstring("12345666678965321"));
        System.out.println(lengthOfLongestSubstring("sghxvnfghsd"));
        System.out.println(lengthOfLongestSubstring("asdfwqertCB"));
        System.out.println(lengthOfLongestSubstring("asetycvbnafghqerycx"));

    }
}
