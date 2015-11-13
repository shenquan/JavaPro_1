package com.lzw;

/**
 * Created by Administrator on 2015/11/13.
 */
interface OutInterface{
    void f();
}
//定义一个内部类实现OuterInterface接口
class OuterClass2{
    private class InnerClass implements OutInterface{
        InnerClass(String s){
            System.out.println(s);
        }
        public void f(){//重写时不能降低方法的修饰权限范围
            System.out.println("访问内部类中的f()方法");
        }
    }
    public OutInterface doit(){
        return new InnerClass("访问内部类构造方法");
    }
}
public class InterfaceInner {
    public static void main(String[]args) {
        OuterClass2 out = new OuterClass2();
        OutInterface outinter = out.doit();
        outinter.f();
    }
}

