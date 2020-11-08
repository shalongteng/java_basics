package com.slt.java_basics.IO;

import java.io.*;

/**
 * System.out 默认输出到console
 */
public class TestPrintStream2 {
    public static void main(String[] args) {
        //
        String fileName = args[0];
        if(fileName != null){
            list(fileName,System.out);
        }

    }
    public static void list(String fileName,PrintStream printStream){
        try {
            String s = null;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
            while ((s = bufferedReader.readLine()) != null){
                printStream.println(s);
            }
            bufferedReader.close();
        } catch (IOException e) {
            printStream.println("无法读取文件");
        }
    }
}
