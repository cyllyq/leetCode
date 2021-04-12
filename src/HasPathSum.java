import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 给你二叉树的根节点root 和一个表示目标和的整数targetSum ，判断该树中是否存在 根节点到叶子节点 的路径，这条路径上所有节点值相加等于目标和targetSum 。
 *
 * 叶子节点 是指没有子节点的节点。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */


public class HasPathSum {
    public static boolean hasPathSum1(TreeNode root, int targetSum) {
        if (root==null){
            return false;
        }
        Queue<TreeNode> tq = new LinkedList<>();
        Queue<Integer> vq = new LinkedList<>();
        tq.offer(root);
        vq.offer(root.val);
        while (!tq.isEmpty()){
            TreeNode treeNode = tq.poll();
            int sum = vq.poll();
            if(treeNode.right==null && treeNode.left==null){
                if (sum==targetSum){
                    return true;
                }
                continue;
            }
            if (treeNode.left!=null){
                tq.offer(treeNode.left);
                vq.offer(treeNode.left.val+sum);
            }
            if (treeNode.right!=null){
                tq.offer(treeNode.right);
                vq.offer(treeNode.right.val+sum);
            }
        }
        return false;
    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false;
        }
        if (root.left==null && root.right==null){
            return root.val==targetSum;
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(5, new TreeNode(8), new TreeNode(4));
        System.out.println(hasPathSum(treeNode, 13));
    }
}
