package easy;

public class IsBalanced {

    public static boolean isBalanced(TreeNode root){
        if (root==null){
            return true;
        }
        int rightLength = maxDeep(root.right);
        int leftLength = maxDeep(root.left);
        return Math.abs(rightLength-leftLength)<=1 && isBalanced(root.left) && isBalanced(root.right);
    }

    public static int maxDeep(TreeNode root){
        if (root==null){
            return 0;
        }else{
            int rightLength = maxDeep(root.right);
            int leftLength = maxDeep(root.left);
            return Math.max(rightLength, leftLength)+1;
        }
    }

    public static void main(String[] args) {

    }
}
