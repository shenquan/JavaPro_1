package com.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by HSQ on 2015/11/23.
 */
//@Target(ElementType.CONSTRUCTOR);
//@Retention(RetentionPolicy.RUNTIME);
 @interface Constructor_Annotation{
    String value();
}
public class test1 {

    public static void main(String[]args){

    }
}

