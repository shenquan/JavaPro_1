package com.han1;

import java.math.BigInteger;

/**
 * Created by Administrator on 2015/11/11.
 */
public class BigIntegerDemo {
    public BigIntegerDemo() {
    }

   /* @Override
    public String toString() {
        return "BigIntegerDemo{}";
    }*/

    public static void main(String []args){
        BigInteger bigInstance = new BigInteger("4");
        System.out.println(bigInstance.add(new BigInteger("2"))+" "+bigInstance.subtract(new BigInteger("1"))+" "+bigInstance.pow(2));
        BigIntegerDemo a=new BigIntegerDemo();
        System.out.println(a.toString());
    }
}
