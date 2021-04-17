package easy;

/**
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 * 高度平衡 二叉树是一棵满足「每个节点的左右两个子树的高度差的绝对值不超过 1 」的二叉树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-sorted-array-to-binary-search-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class SortedArrayToBST {
    public static TreeNode sortedArrayToBST(int[] nums) {
        return _sortedArrayToBST(nums, 0, nums.length-1);
    }

    public static TreeNode _sortedArrayToBST(int[] nums, int left, int right){
        if (right<left){
            return null;
        }else{
            int median = (left+right)/2;
            TreeNode root = new TreeNode(nums[median]);
            root.right = _sortedArrayToBST(nums, median+1, right);
            root.left = _sortedArrayToBST(nums, left, median-1);
            return root;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-10,-3,0,5,9};
        TreeNode t = sortedArrayToBST(nums);
        System.out.println(t.val);
    }
}
