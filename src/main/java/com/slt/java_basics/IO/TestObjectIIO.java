package com.slt.java_basics.IO;

import lombok.ToString;

import java.io.*;

/**
 * transient 修饰的字段 不会吗序列化到硬盘上
 */
public class TestObjectIIO {
    public static void main(String[] args) {
        T t = new T();
        t.k = 8;
        try {
            FileOutputStream outputStream = new FileOutputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(t);
            objectOutputStream.flush();
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("/Users/shalongteng/IdeaProjects2/java_basics/HELP.md");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            T t1 = (T) objectInputStream.readObject();

            System.out.println(t1);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
@ToString
class T implements Serializable{
    int i = 0;
    int j = 9;
    double d = 2.3;
    transient int k = 12;
}