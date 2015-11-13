package com.Collection;

import java.text.CollationElementIterator;
import java.util.*;

/**
 * Created by Administrator on 2015/11/13.
 */
public class UpdateStu2 {
    public static void main(String[]args){
        Map<String,String> map =new HashMap<>();
        map.put("01","李同学");
        map.put("02","啊同学");
        map.put("02","韩同学");
        map.put("04","韩同学");
        Set<String> set=map.keySet();
        Iterator<String> it=set.iterator();
        System.out.println("key集合中的元素");
        while(it.hasNext()){
            System.out.println(it.next());
        }
        Collection<String> coll=map.values();
        it=coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
