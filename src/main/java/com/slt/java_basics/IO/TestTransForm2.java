package com.slt.java_basics.IO;

import java.io.*;

/**
 * 转换流
 *  System.in 接受键盘输入流
 *  程序运行起来，会阻塞等待 键盘输入。
 */
public class TestTransForm2 {
    public static void main(String[] args) {
        try {
            String s = null;
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);

            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

            s = bufferedReader.readLine();
            //可以直接写一个字符串了
            while (s != null){
                if(s.equalsIgnoreCase("exit")){
                    break;
                }
                System.out.println(s.toUpperCase());
                s = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
