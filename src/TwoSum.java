import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class TwoSum {

    //遍历循环，暴力解法
    /**
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (nums[i]+nums[j]==target){
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }
     **/

    //使用哈希表来存储 nums[i], i
    //寻找是否存在key=target-nums[i]
    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]), i};
            }else{
                hashMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
    }
}
