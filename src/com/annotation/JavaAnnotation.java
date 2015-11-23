package com.annotation;

/**
 * Created by HSQ on 2015/11/23.
 */
public class JavaAnnotation {
}

@interface NoMemberAnnotation{

}
@interface OneMember{
 String value();
}
@interface MoreMember{
    String describe1();
    Class type2();
    String describe() default "<默认值>";
    Class type() default void.class;
}