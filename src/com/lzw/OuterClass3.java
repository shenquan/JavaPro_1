package com.lzw;

/**
 * Created by Administrator on 2015/11/13.
 */
interface OutInterface2 {
    int getValue();
}

public class OuterClass3 {
    static OutInterface2 doit(String x) {
        //在doit方法中定义一个内部类
        class InnerClass2 implements OutInterface2 {
            private InnerClass2() {
//                System.out.println(s);
//                s = x;
                System.out.println(x);
            }

            @Override
            public int getValue() {
                return 0;
            }
        }
        return new InnerClass2();
    }

    public static void main(String[] args) {
        OutInterface2 f = OuterClass3.doit("gjeg");
        OuterClass4 f2 = new OuterClass4();
        OutInterface2 x = f2.doit();
        System.out.println(x.getValue());
        //用静态内部类中的main()进行测设
        StaticInnerClass.Inner.main(args);
    }

}

class OuterClass4 {
    public OutInterface2 doit() {
        return new OutInterface2() {

            private int i = 2;

            public int getValue() {
                return i;
            }

            public int getValue2() {
                return i;
            }

            int i1;
        };
    }
}

class StaticInnerClass {
    int x = 100;

    static class Inner {
        void if1() {
//int y=x;
        }
        public static void main(String[]args){
            System.out.println("fe");
        }
    }
}
