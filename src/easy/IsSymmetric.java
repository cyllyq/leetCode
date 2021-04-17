package easy;

/**
 * 给定一个二叉树，检查它是否是镜像对称的。
 */

public class IsSymmetric {
    public static boolean isSymmetric(TreeNode root) {
        if (root.right==null^root.left==null){
            return false;
        }else if (root.right==null && root.left==null){
            return true;
        } else if (root.right.val!=root.left.val){
            return false;
        }else{
            TreeNode t1 = new TreeNode(root.right.val, root.right.right, root.left.left);
            TreeNode t2 = new TreeNode(root.right.val, root.right.left, root.left.right);
            return isSymmetric(t1)&&isSymmetric(t2);
        }
    }

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        System.out.println(isSymmetric(p));
    }
}
