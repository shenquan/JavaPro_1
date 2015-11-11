package com.han1.core;

/**
 * Created by Administrator on 2015/11/11.
 */
public class Test {
    public Test(){
System.out.println("父类构造方法");
    }
    protected void doSomething(){
        System.out.println("父类doSomething");
    }
    protected Test doIt(){
        return new Test();
    }
}
class Test2 extends Test{
    public Test2(){
        super();
        super.doSomething();
    }
    public void doSomething(){

    }
    protected Test2 doIt(){
        return new Test2();
    }
//    protected void doSomething(){}
    public static void main(String []args){
        Test2 a=new Test2();
    }
}
