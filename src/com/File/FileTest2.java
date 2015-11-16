package com.File;

import java.io.File;

/**
 * Created by Administrator on 2015/11/16.
 */
public class FileTest2 {
    public static void main(String[]args){
        File file=new File("word.txt");
        if(file.exists()){
            String name=file.getName();
            long length=file.length();
            boolean hidden=file.isHidden();
            System.out.println(name+"\n"+length+"\n"+hidden);
        }else {
            try{
                System.out.println("该文件不存在");
                file.createNewFile();
                System.out.println("文件已经创建");
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }
}
