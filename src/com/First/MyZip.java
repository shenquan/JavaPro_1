package com.First;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * Created by Administrator on 2015/11/18.
 */
public class MyZip {
    private void zip(String zipFileName, File inputFile) throws Exception {
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zipFileName));
        System.out.println("压缩中...");
        zip(out, inputFile, "");

        out.close();
    }

    private void zip(ZipOutputStream out, File f, String base) throws Exception {
        if (f.isDirectory()) {
            File[] fl = f.listFiles();
            for(File e:fl){
                System.out.println(String.valueOf(e));
            }
//            System.out.println(base);
            out.putNextEntry(new ZipEntry(base + "\\"));
//            base = base.length() == 0 ? "" : base + "\\";
            for (int i = 0; i < fl.length; i++) {
                zip(out, fl[i], String.valueOf(fl[i]));
            }

        } else {
//            System.out.println(base);
            out.putNextEntry(new ZipEntry(base));
            FileInputStream in = new FileInputStream(f);
            int b;

            while ((b = in.read()) != -1) {
                out.write(b);
            }
            in.close();
        }
    }

    public static void main(String[] temp) {
        MyZip book = new MyZip();
//        String a=new String("fe");
//        System.out.println(a.length());

        try {
            book.zip("d:/java-project/hello.zip", new File("d:/java-project/hello"));
            System.out.println("压缩完成");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

