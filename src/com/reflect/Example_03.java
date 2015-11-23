package com.reflect;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2015/11/19.
 */
public class Example_03 {
    static void staticMethod() throws Exception {
        System.out.println("执行staticMethod方法");
    }

    public int publicMethod(int i) {
        System.out.println("执行publicMethod()方法");
        return i * 100;
    }

    protected int protectedMethod(String s, int i) throws NumberFormatException {
        System.out.println("执行protectedMethod()方法");
        return Integer.valueOf(s);
    }

    private String privateMethod(String... strings) {
        System.out.println("执行privateMethod()方法");
        StringBuffer stringBuffer = new StringBuffer();//用stringBuilder
        for (int i = 0; i < strings.length; i++) {
            stringBuffer.append(strings[i]);
        }
        return stringBuffer.toString();
    }

}

class Test {
    public static void main(String[] args) {
        Example_03 a = new Example_03();
        Class exampleC = a.getClass();

        Method[] declaredMethods = exampleC.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];
            System.out.println("名称为：" + method.getName());
            System.out.println("是否允许带有可变数量的参数" + method.isVarArgs());
            System.out.println("入口参数类型依次为");
            Class[] parameterTypes = method.getParameterTypes();
            for (int j = 0; j < parameterTypes.length; j++) {
                System.out.println(" " + parameterTypes[j]);

            }
            System.out.println("返回值类型为：" + method.getReturnType());
            System.out.println("异常类型为：");
            Class[] exceptionTypes = method.getExceptionTypes();
            for (int j = 0; j < exceptionTypes.length; j++) {
                System.out.println(" " + exceptionTypes[j]);
            }
            boolean isTurn = true;
            while (isTurn) {
                try {
                    isTurn = false;
                    if ("staticMethod".equals(method.getName())) {
                        method.invoke(a);
                        System.out.println();
                    } else if ("publicMethod".equals((method.getName()))) {
                        System.out.println("返回值为：" + method.invoke(a, 168));
                        System.out.println();
                    } else if ("protectedMethod".equals(method.getName())) {
                        System.out.println("返回值为：" + method.invoke(a, "7", 5));
                        System.out.println();
                    } else if ("privateMethod".equals(method.getName())) {
                        Object[] parameters = new Object[]{
                                new String[]{"M", "W", "Q"}
                        };
                        System.out.println("返回值为：" + method.invoke(a, parameters));
                        System.out.println();
                    }
                } catch (Exception e) {
                    System.out.println("在执行方法时抛出异常，下面执行setAccessible()方法");
                    method.setAccessible(true);
                    isTurn = true;
//                    isTurn=false;
                }
            }

        }

    }
}
