/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/length-of-last-word
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class LengthOfLastWord {

    public static int lengthOfLastWord1(String s) {
        String[] strs = s.split(" ");
        return strs.length==0?0:strs[strs.length-1].length();
    }

    public static int lengthOfLastWord(String s) {
        int start = -1;
        int end = -1;
        for (int i=s.length()-1;i>=0;i--){
            if (end==-1 && s.charAt(i)!=' '){
                end = i;
            }else if (end!=-1 && s.charAt(i)==' '){
                start = i;
            }
            if (start!=-1 && end!=-1){
                return end-start;
            }
        }
        return end+1;

    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("111 "));
        System.out.println(lengthOfLastWord("hello worlds "));
        System.out.println(lengthOfLastWord("i am yours"));
        System.out.println(lengthOfLastWord("111 "));
    }
}
