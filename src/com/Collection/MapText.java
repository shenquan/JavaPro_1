package com.Collection;

import java.util.*;

/**
 * Created by Administrator on 2015/11/13.
 */
class Emp{
    private String eId;
    private String eName;
    public Emp(String eId,String eNmae){
        this.eId=eId;
        this.eName=eNmae;
    }
    public String getEId(){
        return this.eId;
    }
    public String geteName(){
        return this.eName;
    }

}
public class MapText {
    public static void main(String []args){
        Map<String,String> map=new HashMap<>();
        Emp emp1=new Emp("1234","张三");
        Emp emp2=new Emp("123","李四");
        Emp emp3=new Emp("2","王一");
        map.put(emp1.getEId(),emp1.geteName());
        map.put(emp2.getEId(),emp2.geteName());
        map.put(emp3.getEId(),emp3.geteName());

        Set <String> set= map.keySet();
        Iterator <String> it =set.iterator();
        while (it.hasNext()){
            String str=it.next();
            String name=map.get(str);
            System.out.println(str+" "+name);
        }
        TreeMap<String,String> treeMap=new TreeMap<>();
        treeMap.putAll(map);//
        Iterator <String> iter1=treeMap.keySet().iterator();
        while(iter1.hasNext()){
            String str=iter1.next();
            String name=treeMap.get(str);
            System.out.println(str+" "+name);
        }


    }
}
