package com.exception;

/**
 * Created by Administrator on 2015/11/13.
 */

public class Shoot {
    static int N=-4;
    static void pop()throws NegativeArraySizeException{
        /*if(N<0){
            throw new NegativeArraySizeException();
        }*/
        System.out.println("---------");
        int []arr=new int [N];
    }
    public static void main(String[]args){
        try {
            pop();
        }catch (NegativeArraySizeException e){
            System.out.println("pop()方法抛出异常");
        }

    }
}
