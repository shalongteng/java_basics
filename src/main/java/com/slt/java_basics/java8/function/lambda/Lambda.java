package com.slt.java_basics.java8.function.lambda;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        //匿名类
        File[] files1 = new File("C:\\h2database2").listFiles(new FileFilter() {
            @Override
            public boolean accept(File file) {
                return file.canRead();
            }
        });
        //方法引用  对应 对象引用（new）
        File[] files2 = new File("C:\\h2database2").listFiles(File::canRead);
        //java8.predicate.lambda 表达式 匿名函数
        File[] files3 = new File("C:\\h2database2").listFiles(p -> p.canRead());

        System.out.println(Arrays.toString(files1));
        System.out.println(Arrays.toString(files2));
        System.out.println(Arrays.toString(files3));
    }
}
