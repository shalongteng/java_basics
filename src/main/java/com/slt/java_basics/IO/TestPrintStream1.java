package com.slt.java_basics.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * System.out 默认输出到console
 */
public class TestPrintStream1 {
    public static void main(String[] args) {
        PrintStream printStream = null;

        try {
            FileOutputStream outputStream = new FileOutputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md");
            printStream = new PrintStream(outputStream);

            if(printStream != null){
                System.setOut(printStream);
            }
            int len = 0;

            for(char c = 0;c<60000;c++){
                System.out.print(c+" ");
                if(len++ >=100){
                    System.out.println();
                    len = 0;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
