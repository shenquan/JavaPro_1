package com.han1;

import com.han1.core.Test;

/**
 * Created by Administrator on 2015/11/10.
 */
public class AccessProperty {
    static int i = 47;

    public void call() {
        System.out.println("call:");
        for (i = 0; i < 3; i++) {
            System.out.print(i + " ");
            if (i == 2) {
                System.out.println();
            }
        }

    }

    public AccessProperty() {
    }

    public static void main(String[] args) {
        AccessProperty t1 = new AccessProperty();
        AccessProperty t2 = new AccessProperty();
        t2.i = 60;
        System.out.println(t1.i++);
        System.out.println(t1.i);
        t1.call();
        System.out.println("t2.i=" + t2.i);
        t2.call();
        System.out.println("t1.i=" + t1.i);
        Test tef=new Test();
    }

}
