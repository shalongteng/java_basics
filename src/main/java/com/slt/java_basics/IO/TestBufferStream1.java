package com.slt.java_basics.IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 */
public class TestBufferStream1 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("/Users/shalongteng/IdeaProjects2/java_basics/src/main/java/com/slt/java_basics/IO/TestBufferStream1.java");

            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            int c = 0;
            System.out.println(bufferedInputStream.read());
            System.out.println(bufferedInputStream.read());
            System.out.println(bufferedInputStream.read());

            bufferedInputStream.mark(98);//将标记 置到98


            for (int i  =0;i<27 && (c = bufferedInputStream.read()) !=-1;i++){
                System.out.print((char)c);
            }
            System.out.println();
            bufferedInputStream.reset();//将标记位 挪到98

            for (int i  =0;i<27&& (c = bufferedInputStream.read()) !=-1;i++){
//                System.out.print(c+" ");
                System.out.print((char)c);

            }

            bufferedInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
