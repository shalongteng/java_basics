package com.slt.java_basics.dsa;

public class Pow {
    public static void main(String[] args) {

        System.out.println(power2(10));
    }

    /**
     * 线性递归 计算幂函数power(2, n) = 2^n的问题
     * 时间复杂度 O(n)
     */
    public static int power(int n)
    {
        if(n == 0)
            return 1;
        return 2*power(n-1);
    }

    /**
     * 偶数n 100 左移一位 得到10  2^4 = (2^2)^2
     * 奇数n 101 左移一位 得到10  2^5 = (2^2)^2 * 2
     * 就是最后一位 是1还是0   1的话要乘以2  0的话就不用了
     * 、
     * 线性递归 虽然有两个分支，但是每次只能运行其中的一个分支。
     * 时间复杂度是 O(logn)
     */
    public static int power2(int n)
    {
        if(n==1)
            return 2;
        //n 如果为偶数
        if(n % 2 == 0){
            return sqr(power2(n >> 1));
        }else{//n 如果为奇数
            return sqr(power2(n >> 1)) * 2;
        }
    }
    public static int  sqr(int a) {
        return a * a;
    }

    /**
     * 最后一次调用 完全是调用实例
     */
    public static void reverse(int []a,int lo,int hi){
        while (lo < hi){
//            swap(a[lo],a[hi]);
            lo--;
            hi++;
        }
    }
}
