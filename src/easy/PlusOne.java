package easy;

import java.util.Arrays;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        digits[digits.length-1] += 1;
        int jinwei = 0;
        int temp = 0;
        for (int i=digits.length-1; i>=0; i--){
            temp = (digits[i] + jinwei) / 10;
            digits[i] = (digits[i] + jinwei) % 10;
            jinwei = temp;
            if (jinwei==0){
                break;
            }
        }
        if (jinwei==0){
            return digits;
        }else{
            System.out.println("111111");
            int[] re = new int[digits.length+1];
            re[0] = 1;
            System.arraycopy(digits, 0, re, 1, digits.length);
            return re;
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9,9,9})));
        System.out.println(Arrays.toString(plusOne(new int[]{8,9,9,9})));
    }
}