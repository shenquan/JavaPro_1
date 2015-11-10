package com.han1;

/**
 * Created by Administrator on 2015/11/10.
 */
public class GetBoolean {
    public static void main(String []args){
        Boolean b1=new Boolean(true);
//        System.out.println();
        Boolean b2=new Boolean("TruE2");
        System.out.println("b1: "+b1.booleanValue());
        System.out.println("b2: "+b2.booleanValue());
        System.out.println(b1.equals(b2)+"\n"+Boolean.TYPE+"\n"+Integer.TYPE+"\n"+Byte.TYPE);
        Character mychar1=new Character('A');
        System.out.println(Character.isUpperCase(mychar1));
    }
}
