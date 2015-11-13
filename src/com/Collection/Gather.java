package com.Collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2015/11/13.
 */
public class Gather {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        int i=(int)(Math.random()*(list.size()));
        System.out.println("list.get()="+list.get(i));

        list.remove(2);
        for(int j=0;j<list.size();j++){
            System.out.println(list.get(j));
        }

    }
}
