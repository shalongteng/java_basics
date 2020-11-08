package com.slt.java_basics.IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 测试FIleReader
 *  可以读取中文
 *  多一个中文会多一个字符，多两个字节
 *  多一个英文会多一个字符，多一个字节
 */
public class TestFIleReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        int c  = 0;

        int num = 0;
        try {
            fileReader = new FileReader("/Users/shalongteng/IdeaProjects2/java_basics/src/main/java/com/slt/java_basics/IO/TestFileInputStream.java");
            while ((c = fileReader.read())  !=  -1){
                System.out.print((char)c);
                num++;
            }
            System.out.println("共读取了"+num+"个字符");

            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

        }
    }
}
