package com.exception;

/**
 * Created by Administrator on 2015/11/13.
 */
public class Take {
    public static void main(String[] args) {
        try {
            String str = "lili";
            System.out.println("年龄是");
            System.exit(69);
            int age = Integer.parseInt("20L");
            System.out.println("OK");
            System.out.println("mowei");
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("发生异常");
//            e.toString();
        }finally {
            String str = "lili";
            System.out.println("年龄是");
            int age = Integer.parseInt("20L");
            System.out.println("OK");
            System.out.println("mowei");
            System.out.println("finally");
        }
        System.out.println("last");
    }
}
