/**
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */

public class IsPalindrome {

    //判断首尾是否相等的方法
    public static boolean isPalindrome1(int x){
        if (x<0 || (x%10==0 && x!=0)) return false;
        int max = 1;
        //用于查询头部数字的整数
        while(x/max>=10){
            max *= 10;
        }
        while (x>0){
            int left = x/max;
            int right = x%10;
            if (left!=right) return false;
            //每次去掉收尾
            x = (x%max)/10;
            max /= 100;
        }
        return true;
    }

    //取后半部分倒装，和前半部分进行比较 中间判断 前值<后值
    public static boolean isPalindrome(int x){
        System.out.println(0/10);
        //if (x<0 || (x%10==0 && x!=0)) return false;
        int pre = 0;
        while (x>pre){
            pre = pre*10+(x%10);
            x /= 10;
        }
        System.out.println(x + "----" + pre + "----" +pre/10);
        return x==pre || x==(pre/10);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(99));
    }
}
