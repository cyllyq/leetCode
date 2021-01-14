/**
 * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
 */

public class MaxSubArray {

    //暴力方法
    public static int maxSubArray1(int[] nums) {
        int max = nums[0];
        int temp = 0;
        for (int i=0; i<nums.length; i++){
            temp = 0;
            for (int j=i; j<nums.length; j++){
                temp+=nums[j];
                if (max<temp){
                    max = temp;
                }
            }
        }
        return max;
    }

    public static int maxSubArray(int[] nums){
        int max = nums[0];
        int pre = 0;
        for (int i=0; i<nums.length; i++){
            pre += nums[i];
            max = Math.max(pre, max);
            if (pre<0){
                pre=0;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2,-1}));
    }
}
