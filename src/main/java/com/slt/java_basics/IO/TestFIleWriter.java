package com.slt.java_basics.IO;

import ch.qos.logback.core.pattern.FormatInfo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * TestFIleWriter
 * write
 *  清空源文件 重写进去
 *
 *  如果是？？？ 也是写进去了，只不过idea不支持读。
 */
public class TestFIleWriter {
    public static void main(String[] args) {
        FileWriter fileWriter = null;
        int c = 0;

        int num = 0;
        try {
            //把全世界 大多数字符都写进去了
            // 前128 是ASCII 字符
            fileWriter = new FileWriter("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md");
            for (int i = 0; i < 70000; i++) {
                if(i % 100  == 0){
                    fileWriter.write("\r");
                }
                fileWriter.write(i);
            }

            fileWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        System.out.println("写字符结束");
    }
}
