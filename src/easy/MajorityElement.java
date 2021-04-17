package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数 大于⌊ n/2 ⌋的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 */

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i:nums){
            int count = map.get(i)==null?1:map.get(i)+1;
            if (count>nums.length/2){
                return i;
            }
            map.put(i, count);
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
