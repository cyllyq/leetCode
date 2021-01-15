/**
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 */

import sun.reflect.generics.tree.Tree;

import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

public class IsSameTree {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode[]> queue = new LinkedList<>();
        queue.offer(new TreeNode[]{p, q});
        TreeNode[] t = new TreeNode[2];
        if (p==null&&q==null){
            return true;
        }else if(p==null || q==null){
            return false;
        }
        while (!queue.isEmpty()){
            t = queue.poll();
            if (t[0].val!=t[1].val){
                return false;
            }else{
                if (t[0].left==null^t[1].left==null){
                    return false;
                }else if(t[0].left!=null&&t[1].left!=null) {
                    queue.offer(new TreeNode[]{t[0].left, t[1].left});
                }
                if(t[0].right==null^t[1].right==null){
                    return false;
                }else if(t[0].right!=null&&t[1].right!=null){
                    queue.offer(new TreeNode[]{t[0].right, t[1].right});
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(1);
        System.out.println(isSameTree(p, q));
    }
}
