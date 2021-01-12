/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */

public class SearchInsert {
    public static int searchInsert(int[] nums, int target) {
        for (int i=0; i<nums.length; i++){
            if (target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{11,22,33,44,55,66,77,88};
        System.out.println(searchInsert(nums, 54));
    }
}
