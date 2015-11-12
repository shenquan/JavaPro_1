package com.han1;

/**
 * Created by Administrator on 2015/11/12.
 */
public class OverLoadTest2 {
    public static int add(int a,int b){
        return a+b;
    }
    static double add(double a,double b){
        return a+b;
    }
    public static int add(int...a){
        int s=0;
        for(int i=0;i<a.length;i++){
            s+=a[i];
        }
        return s;
    }
    public static int add(int a){
        return a+3;
    }
    public static int add(int a,double b){
        return 1;
    }
    public static int add(double a,int b){
        return 2;
    }
    public static double delete(){
        return 1.0;
    }
    /*public static float delete(){
        return 2.0;
    }*/

    public static void main(String []args){
        System.out.println(add(1,2)+" "+add(2.1,3.3)+" "+add(1)+ " "+add(1,2,3,4,5)+" "+add(9));
    }
}
