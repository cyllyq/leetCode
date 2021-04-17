package easy;

public class Reverse {
    public static int reverse(int x) {
        int re = 0;
        while (x != 0){
            int pop = x % 10;
            x /= 10;
            //判断溢出
            if (re > Integer.MAX_VALUE/10 || (re==Integer.MAX_VALUE/10 && pop>7)){
                return 0;
            }
            if (re < Integer.MIN_VALUE/10 || (re==Integer.MIN_VALUE/10 && pop<-8)){
                return 0;
            }
            re = re * 10 + pop;
        }
        return re;
    }

    public static void main(String[] args) {
        System.out.println(reverse(1534236469));
    }
}
