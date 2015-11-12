package com.lzw;

/**
 * Created by Administrator on 2015/11/12.
 */
public class OuterClass {
    class innerClass {
        innerClass() {

        }

        public void inf() {

        }

        int y = 0;
    }

    innerClass in = new innerClass();

    public void ouf() {
        in.inf();
    }

    public innerClass doit() {
//        y=4;
        in.y = 4;
        return in;
    }

    public static void main(String[] args) {
        OuterClass out = new OuterClass();
        OuterClass.innerClass in = out.doit();
        System.out.println(in.y);
        OuterClass.innerClass in2 = out.new innerClass();

        OuterClass out2 = new OuterClass();
        OuterClass.innerClass in3 = out.new innerClass();
    }
}
