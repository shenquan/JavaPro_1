package com.han1;

/**
 * Created by Administrator on 2015/11/10.
 */
public class TransferProperty {
    int i = 47;

    public void call() {
        for (int i = 0; i < 3; i++) {
            if (i == 2) {
                System.out.println(i);
            }
        }
    }

    public TransferProperty() {

    }

    public TransferProperty(int i) {
        this.i = i;
    }

    public static void main(String[] args) {
        TransferProperty t1 = new TransferProperty(30);
        TransferProperty t2 = new TransferProperty();
        t2.i = 60;
        t1.call();
        System.out.println(t1.i++);
        System.out.println(t1.i++);
        t2.call();
    }
}
