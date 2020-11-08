package com.slt.java_basics.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 */
public class TestFileOutputStream {
    public static void main(String[] args) {
        int b = 0;
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        int num = 0;

        try {
            //一根管道 怼到他自己身上。 构建 这根管道。
            inputStream = new FileInputStream("/Users/shalongteng/IdeaProjects2/java_basics/src/main/java/com/slt/java_basics/IO/TestFileInputStream.java");
            //准备往 help.md 文件中 灌水
            outputStream = new FileOutputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md");
            //读到结尾 就是-1
            while ((b = inputStream.read()) != -1){
                outputStream.write(b);
                num++;
            }
            inputStream.close();
            outputStream.close();
        }catch (FileNotFoundException e){
            //字节流 无法读取中文，中午一个字是两个字符。
            System.out.println("找不到指定文件");
            System.exit(-1);
        }catch (IOException e) {
            System.out.println("文件读取错误");
            System.exit(-1);
        }
        System.out.println("文件已经复制");
    }
}
