package easy;

import java.time.temporal.Temporal;
import java.util.Arrays;

/**
 * 给你两个有序整数数组nums1 和 nums2，请你将 nums2 合并到nums1中，使 nums1 成为一个有序数组。
 *
 * 初始化nums1 和 nums2 的元素数量分别为m 和 n 。你可以假设nums1有足够的空间（空间大小等于m + n）来保存 nums2 中的元素。
 *
 *
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Merge {
    //双指针 从前往后
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0;
        int p2 = 0;
        int[] temp = new int[m+n];
        System.arraycopy(nums1, 0, temp, 0, m);
        while(p1<m && p2<n){
            if (temp[p1]>nums2[p2]){
                nums1[p1+p2] = nums2[p2];
                p2++;
            }else{
                nums1[p1+p2] = temp[p1];
                p1++;
            }
        }
        if (p1<m){
            System.arraycopy(temp, p1, nums1, p1+p2, m-p1);
        }
        if (p2<n){
            System.arraycopy(nums2, p2, nums1, p1+p2, n-p2);
        }
    }

    //双指针 从后往前
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int p1 = m-1;
        int p2 = n-1;
        while (p1>=0 && p2>=0){
            if (nums1[p1]>nums2[p2]){
                nums1[p1+p2+1] = nums1[p1];
                p1--;
            }else{
                nums1[p1+p2+1] = nums2[p2];
                p2--;
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2+1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{3,4,12,15,0,0,0};
        int[] nums2 = new int[]{2,5,11};
        merge(nums1, 4, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }
}
