package com.slt.java_basics.dsa;

public class CountOnes {
    public static void main(String[] args) {
        System.out.println(count(441));
    }

    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            count += (n & 1);
            n >>= 1;
        }
        return count;
    }
}
