package com.first;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by Administrator on 2015/11/18.
 */
public class DataInputOutputStream {
    public static void main(String[]args){
        try{
            FileOutputStream fs= new FileOutputStream("word.txt");
            DataOutputStream ds=new DataOutputStream(fs);

            ds.writeUTF("UTF写入数据");
            ds.writeChars("Chars写入数据");
            ds.writeBytes("Bytes写入数据");

            ds.close();
            FileInputStream fis=new FileInputStream("word.txt");
            DataInputStream dis=new DataInputStream(fis);

            System.out.println(dis.readUTF());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
