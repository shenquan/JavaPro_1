package com.han1;

/**
 * Created by Administrator on 2015/11/8.
 */
public class Book {
    /*private String name;//

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        int id = 0;
        setName("Java");
        ;
        return id + this.name;
    }

    public Book getBook() {
        return this;
    }

    public static void main(String[] args){
        int k=100;
        for(int i=0;i<5;i++){
            System.out.println(String.valueOf(i));
            System.out.println(String.valueOf(k));
        }
        for(int i=0;i<5;i+=2){
            System.out.println(Integer.toString(i));
        }
    }*/

   /* public Book() {
        this("this调用有参");
        System.out.println("无参构造方法");

    }

    public Book(String name) {
        System.out.println("有参构造方法+"+name);
    }
*/
    static {
       int a=3;
   }
    static double PI=3.14;
    static int id=0;
    public static void method1(){
        System.out.println("method1()");
    }
    public void  method2(){

        System.out.println(Book.PI+" "+Book.id);
        Book.method1();
    }
    public  Book method3(){
//        static int a=3;
        method2();
        return this;
    }
    public static void main(String[] args) {
        Book book = new Book();
//        Book.method2();
        x.ff();
        System.out.println(args.length);
    }
}
class x{
    static void ff(){
        System.out.println(Book.PI);

    }
}
