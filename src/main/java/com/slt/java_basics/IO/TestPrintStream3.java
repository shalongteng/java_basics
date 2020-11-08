package com.slt.java_basics.IO;

import java.io.*;
import java.net.SocketTimeoutException;
import java.util.Date;

/**
 * System.out 默认输出到console
 */
public class TestPrintStream3 {
    public static void main(String[] args) {
        String s = null;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            FileWriter fileWriter = new FileWriter("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md",true);
            PrintWriter log = new PrintWriter(fileWriter);

            while ((s =bufferedReader.readLine()) !=null){
                if(s.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println(s.toUpperCase());
                log.println("------");
                log.println(s.toUpperCase());
                log.flush();
            }
            log.println(new Date());
            log.flush();
            log.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
