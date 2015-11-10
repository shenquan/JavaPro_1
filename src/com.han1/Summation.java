package com.han1;

/**
 * Created by Administrator on 2015/11/10.
 */
public class Summation {
    public static void main(String [] args){
       /* String str[]={"89","12","10","18","35"};
        int sum=0;
        for(int i=0;i<str.length;i++){
            int myint = Integer.parseInt(str[i]);
            sum=sum+myint;
        }
        System.out.println(sum);*/
        String str1=Integer.toString(456);
        String str2=Integer.toBinaryString(456);
        String str3=Integer.toHexString(456);
        String str4=Integer.toOctalString(456);
        System.out.println(str1+" "+str2+" "+str3+" "+str4);
    }
}
