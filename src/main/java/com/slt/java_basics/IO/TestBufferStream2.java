package com.slt.java_basics.IO;

import java.io.*;

/**
 * 先写后读
 */
public class TestBufferStream2 {
    public static void main(String[] args) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md"));
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md"));
            String s = null;

            for (int i =0;i<100;i++){
                s = String.valueOf(Math.random());
                bufferedWriter.write(s);
                bufferedWriter.newLine();//写一个字符串 换一行
            }
            bufferedWriter.flush();//把小桶里的水 倒光

            //readLine 一次读一行
            while ((s = bufferedReader.readLine()) != null){
                System.out.println(s);
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
