package com.slt.java_basics.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 中文啊啊p你
 * utf-8 的汉字占3个字节 gbk 是两个
 */
public class TestFileInputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream inputStream = null;

        try {
            //一根管道 怼到他自己身上。 构建 这根管道。
            inputStream = new FileInputStream("/Users/shalongteng/IdeaProjects2/java_basics/src/main/java/com/slt/java_basics/IO/TestFileInputStream.java");
        }catch (FileNotFoundException e){
            //字节流 无法读取中文，中午一个字是两个字符。
            System.out.println("找不到指定文件");
            System.exit(-1);
        }

        int num = 0;
        try {
            //读到结尾 就是-1
            while ((b = inputStream.read()) != -1){
                System.out.print((char)b);
                num++;
            }
            inputStream.close();
            System.out.println();
            System.out.println("共读取了"+num+"个字节");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("文件读取错误");
            System.exit(-1);
        }

    }
}
