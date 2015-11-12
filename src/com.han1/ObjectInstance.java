package com.han1;

/**
 * Created by Administrator on 2015/11/12.
 */
public class ObjectInstance {
    public String toString(){
        return "在"+this.getClass().getName()+"类中重写toString()方法";
    }
    public static void main(String [] args){
        System.out.println(new ObjectInstance());
    }
}
