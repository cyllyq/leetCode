/**
 * 给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 */

public class MaxDepth {
    public static int maxDepth(TreeNode root){
        if (root==null){
            return 0;
        }else{
            int leftLength = maxDepth(root.left);
            int rightLength = maxDepth(root.right);
            return Math.max(rightLength, leftLength)+1;
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        System.out.println(maxDepth(p));
    }
}
