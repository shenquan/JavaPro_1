package com.reflect;

import java.lang.reflect.Constructor;

/**
 * Created by Administrator on 2015/11/18.
 */
public class Example_01 {
    String s;
    int i, i2, i3;

    private Example_01() {

    }

    protected Example_01(String s, int i) {
        this.s = s;
        this.i = i;
    }

    private Example_01(String... strings) throws NumberFormatException {
        if (0 < strings.length) i = Integer.valueOf(strings[0]);
        if (1 < strings.length) i2 = Integer.valueOf(strings[1]);
        if (2 < strings.length) i3 = Integer.valueOf(strings[2]);//原来这里曾把2写为1s
    }

    public void print() {
        System.out.println("s=" + s + "\n" + "i=" + i + "\n" + "i2=" +i2+ "\n" + "i3=" + i3);
    }

    static public final void main(String[] args) {
        Example_01 example = new Example_01();
        Class exampleC = example.getClass();
        Constructor[] declaredConstructors = exampleC.getDeclaredConstructors();
        System.out.println("declaredlength=" + declaredConstructors.length);
        for (int i = 0; i < declaredConstructors.length; i++) {
            Constructor constructor = declaredConstructors[i];
            System.out.println("查看是否允许带有可变参数数量的参数:" + constructor.isVarArgs());
            System.out.println("该构造方法的入口参数类型依次为");
            Class[] parameteTypes = constructor.getParameterTypes();
            for (int j = 0; j < parameteTypes.length; j++) {
                System.out.println(" " + parameteTypes[j]);
            }

            System.out.println("该构造方法可能抛出的异常类型为:");
            Class[] exceptionTypes = constructor.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(" " + exceptionTypes[j]);
            }
            Example_01 example2 = null;
            while (example2 == null) {
                try {
                    if (i == 2) {
                        example2 = (Example_01) constructor.newInstance();
                    } else if (i == 1) {
                        example2 = (Example_01) constructor.newInstance("7", 5);

                    } else {
                        Object[] parameters = new Object[]{new String[]{"100", "200", "300"}};
                        example2 = (Example_01) constructor.newInstance(parameters[0]);
                    }
                } catch (Exception e) {
                    System.out.println("在创建对象时抛出异常，下面执行setAccessible()方法");
                    constructor.setAccessible(true);
                }
            }
            example2.print();
            System.out.println();
        }
    }

}
