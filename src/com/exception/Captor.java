package com.exception;

/**
 * Created by Administrator on 2015/11/13.
 */
class MyException2 extends Exception {
    String Message;

    public MyException2(String ErrorM) {
        Message = ErrorM;
    }

    public String getMessage() {
        return Message;
    }
}

public class Captor {
    static int quotient(int x, int y) throws MyException2 {
        if (y < 0) {
            throw new MyException2("除数不能是负数");
        }
        return x / y;
    }

    public static void main(String[] args) {
        try {
            int result = quotient(3, 4);
            int a[]=new int[-4];
            int result2 = quotient(3, -5);
            System.out.println("金额各");
        } catch (MyException2 e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("除数不能是0");
        } catch (Exception e) {
            System.out.println("程序发生了其它的异常");
        } finally {

        }
        try {
            int result = quotient(3, 0);
            System.out.println("金额各");
        } catch (ArithmeticException e) {
            System.out.println("除数不能是0");
        }
        catch (MyException2 e){

        }
        try{

        }catch (Exception e){

        }
        System.out.println("jj");
    }
}
