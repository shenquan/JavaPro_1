package com.han1;

/**
 * Created by Administrator on 2015/11/12.
 */
class V{

}
class Quadrangle{
    public static void draw(Quadrangle  q){
System.out.println("四边形");
    }
}
class Parallelogram extends Quadrangle{
    public static void s(){
        Quadrangle p=new Parallelogram();
        Quadrangle.draw(p);
        Parallelogram q=(Parallelogram) p;
        Quadrangle m=new Quadrangle();
        if(p instanceof Parallelogram){
            System.out.println("1");
        }
        if(q instanceof Parallelogram){
            System.out.println("2");
        }
       /* if(q instanceof V){

        }*/
    }
}
public class OverWriteEquals {
    public static void main(String[] args){
        String s1="123";
        String s2 ="123";
        System.out.println(s1.equals(s2));
        V v1=new V();
        V v2=new V();
        System.out.println(v1.equals(v2));
        Parallelogram.s();
    }
}
