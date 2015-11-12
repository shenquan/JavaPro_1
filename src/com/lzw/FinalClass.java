package com.lzw;

/**
 * Created by Administrator on 2015/11/12.
 */
final public class FinalClass {
    int a=3;
    void doin(){

    }
    public static void main(String[]args){
        FinalClass f=new FinalClass();
        f.a++;
        System.out.println(f.a);
    }
}
