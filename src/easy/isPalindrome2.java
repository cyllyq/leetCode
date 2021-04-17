package easy;

/**
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 */

public class isPalindrome2 {
    public static boolean isPalindrome(String s) {
        int leftIndex = 0;
        int rightIndex = s.length()-1;
        while (rightIndex>=leftIndex){
            if (!Character.isLetterOrDigit(s.charAt(leftIndex))){
                leftIndex += 1;
                continue;
            }
            if (!Character.isLetterOrDigit(s.charAt(rightIndex))){
                rightIndex -= 1;
                continue;
            }
            if (Character.toLowerCase(s.charAt(leftIndex))!=Character.toLowerCase(s.charAt(rightIndex))){
                return false;
            }
            leftIndex += 1;
            rightIndex -= 1;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("race a car"));
    }
}
