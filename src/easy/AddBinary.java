package easy;

/**
 * 给你两个二进制字符串，返回它们的和（用二进制表示）。
 *
 * 输入为 非空 字符串且只包含数字 1 和 0。
 */

public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuffer sb = new StringBuffer();
        int aLength = a.length(), bLength = b.length();
        int carry = 0;
        int forCount = Math.max(aLength, bLength);
        for (int i=0; i<forCount; i++){
            carry += i<aLength?(a.charAt(aLength-i-1)-'0'):0;
            carry += i<bLength?(b.charAt(bLength-i-1)-'0'):0;
            sb.append((char)(carry%2+'0'));
            carry /= 2;
        }
        if (carry>0){
            sb.append('1');
        }
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(addBinary("0", "0"));
        System.out.println(addBinary("110", "11111"));
    }
}
