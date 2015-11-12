package com.lzw;

/**
 * Created by Administrator on 2015/11/12.
 */
class Parents {
    int i = 1;

    final void doit() {
        System.out.println("父类.doit()");
    }

    final void doit2() {
        System.out.println("父类.doit2()");
    }

    public void doit3() {
        System.out.println("父类.doit3()");
    }
}

class Sub extends Parents {
    int j = 2;
    /*public final void doit() {
        System.out.println("子类.doit()");
    }*/

    /*final void doit2(){
        System.out.println("子类.doit2()");
    }*/
    public void doit3() {
        System.out.println("子类.doit3()");
    }

    public void doit4() {

    }
}

public final class FinalMethod {
    public static void main(String[] args) {
        Sub s = new Sub();
//        s.doit();
        s.doit2();
        s.doit3();
        Parents s1 = new Parents();
        s1.doit3();
        System.out.println();
//        Parents p = s;
//        p.doit();
        Parents p = new Sub();
        p.doit();
        p.doit2();
        p.doit3();
//        p.doit4();
        System.out.println("j=" + s.j);
        System.out.println("i=" + p.i);
    }
}
