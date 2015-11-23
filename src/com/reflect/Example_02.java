package com.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by Administrator on 2015/11/18.
 */
public class Example_02 {

    private float f = 2.1f;
    public boolean b;
    protected String s;
    public int i;
    static private double j;
    private final static double j1 = 1;

}
class Test2{
    public static void main(String[] args) {
        Example_02 example = new Example_02();
        Class exampleC = example.getClass();
        Field[] declaredFields = exampleC.getDeclaredFields();
        for (int i = 0; i < declaredFields.length; i++) {
            Field field = declaredFields[i];//遍历成员变量
            System.out.println("modifiers为："+field.getModifiers()+" " + Modifier.toString(field.getModifiers()));
            System.out.println("名称为：" + field.getName());
            Class fieldType = field.getType();
            System.out.println("类型为：" + fieldType);
            boolean isTurn = true;
            while (isTurn) {
                try {
                    isTurn = false;
                    System.out.println("修改前的值为：" + field.get(example));

                    if (fieldType.equals(int.class)) {
                        field.setInt(example, 168);
                    }
                    System.out.println("修改后的值为：" + field.get(example));


                } catch (Exception e) {
                    System.out.println("出现异常出现异常出现异常出现异常出现异常，private");
                    field.setAccessible(true);
                    isTurn = true;

                }
            }
        }
    }
}
