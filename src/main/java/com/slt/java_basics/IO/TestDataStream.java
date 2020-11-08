package com.slt.java_basics.IO;

import java.io.*;

/**
 * byteArray 字节数组 内存中一个字节数组被分配了，然后一个管道怼到这个字节数组上
 */
public class TestDataStream {
    public static void main(String[] args) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);

        try {
            dataOutputStream.writeDouble(Math.random());
            dataOutputStream.writeBoolean(true);

            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
            //字节数组 中共有9个字节  double 8 + Boolean 1
            System.out.println(byteArrayInputStream.available());

            DataInputStream dataInputStream = new DataInputStream(byteArrayInputStream);
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readBoolean());


            dataOutputStream.close();
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
