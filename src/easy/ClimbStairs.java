package easy;

/**
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 */

public class ClimbStairs {
    //递归
    public static int climbStairs1(int n) {
        if (n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return climbStairs(n-1)+climbStairs(n-2);
        }
    }

    public static int climbStairs(int n) {
        int n1 = 1, n2 = 1;
        for (int i=1; i<n; i++){
            n2 = n2 + n1;
            n1 = n2 - n1;
        }
        return n2;
    }

    public static void main(String[] args) {
        System.out.println(climbStairs(1));
    }
}
