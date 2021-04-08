/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明：叶子节点是指没有子节点的节点。
 */

public class MinDepth {

    public static int minDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        if (root.right==null && root.left==null){
            return 1;
        }
        int min_depth = Integer.MAX_VALUE;
        if(root.left!=null){
            min_depth = Math.min(minDepth(root.left), min_depth);
        }
        if(root.right!=null){
            min_depth = Math.min(min_depth, minDepth(root.right));
        }
        return min_depth;
    }

    public static void main(String[] args) {

    }

}
