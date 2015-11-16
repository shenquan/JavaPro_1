package com.File;

import java.io.*;

/**
 * Created by Administrator on 2015/11/16.
 */
public class FileInputOutput {
    public static void main(String []args){
        File file = new File("word.txt");
        try {
            FileOutputStream out =new FileOutputStream(file);
            byte buy[]="我有一只小毛驴，我从来也不骑。".getBytes();
            out.write(buy);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try{
            FileInputStream in =new FileInputStream(file);
            byte byt[]=new byte[1024];
            int len=in.read(byt);//从文件中读取长度信息
            System.out.println("len="+len);
            //输出文件信息
            System.out.println("文件中的信息是："+new String(byt,0,len));
            in.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
