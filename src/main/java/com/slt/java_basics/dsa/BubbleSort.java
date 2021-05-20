package com.slt.java_basics.dsa;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int a [] = {4,3,2,1,7,8,9};
        System.out.println(Arrays.toString(a));
        sort2(a);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[]){
        int n = a.length;
        for (boolean sorted = false; sorted = !sorted;n--){
            for (int i = 1;i <n;i++){
                if(a[i-1]>a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    sorted = false;
                }
            }
        }
    }
    public static void sort2(int a[]){
        int n = a.length;
        //n = m 更新数组长度
        //更新后数组长度 > 1 就继续排序
        for (int m = 0; n > 1; n = m){
            //给m初始化,如果m = 1 不被修改，证明数组已经有序了
            for (int i = m = 1;i < n;i++){
                if(a[i-1]>a[i]){
                    int temp = a[i-1];
                    a[i-1] = a[i];
                    a[i] = temp;
                    m = i;//把最后一次交换的下标记录下来，就是下一次循环数组的长度
                }
            }
        }
    }

}
