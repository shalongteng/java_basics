package com.slt.java_basics.dsa;

import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        reverse(a,0,4);
        System.out.println(Arrays.toString(a));

    }

    public static void reverse(int a[],int lo,int hi){
        if(lo < hi){
            reverse(a,lo+1,hi-1);
            int temp = a[lo];
            a[lo] = a[hi];
            a[hi] = temp;
        }//else 隐含了两种递归基
    }
}
