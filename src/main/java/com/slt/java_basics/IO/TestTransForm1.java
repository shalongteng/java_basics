package com.slt.java_basics.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * 转换流
 *  outputStream -> Writer
 *  inputStream -> reader
 */
public class TestTransForm1 {
    public static void main(String[] args) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md"));
            //可以直接写一个字符串了
            outputStreamWriter.write("helloWorld1");
            outputStreamWriter.close();

            outputStreamWriter = new OutputStreamWriter(new FileOutputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md",true),"ISO8859_1");
            outputStreamWriter.write("helloWorld2");
            System.out.println(outputStreamWriter.getEncoding());
            //如果不关闭 helloWorld2 就写不进去
            outputStreamWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
