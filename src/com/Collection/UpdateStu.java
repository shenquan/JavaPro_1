package com.Collection;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Administrator on 2015/11/13.
 */
public class UpdateStu implements Comparable{

    String name;
    long id;
    public UpdateStu(String name,long id){
        this.id=id;
        this.name=name;
    }
    public long getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public int compareTo(Object o) {
        UpdateStu upstu=(UpdateStu) o;
        int result = id>upstu.id?1:(id==upstu.id?0:-1);
        return result;
    }
    public static void  main(String[] args){
        UpdateStu stu1=new UpdateStu("李同学",3);
        UpdateStu stu2=new UpdateStu("陈同学",2);
        UpdateStu stu3=new UpdateStu("王同学",4);
        UpdateStu stu4=new UpdateStu("张同学",1);
        TreeSet<UpdateStu> tree=new TreeSet<>();
        tree.add(stu1);
        tree.add(stu2);
        tree.add(stu3);
        tree.add(stu4);
        System.out.println(tree.size());
        Iterator<UpdateStu> it =tree.iterator();
        while(it.hasNext()){
            UpdateStu stu=it.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }
        System.out.println("截取前面部分的集合");
        it = tree.headSet(stu3).iterator();
        while(it.hasNext()){
            UpdateStu stu = it.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }
        it = tree.subSet(stu2,stu3).iterator();
        System.out.println("截取中间部分的集合");
        while(it.hasNext()){
            UpdateStu stu=it.next();
            System.out.println(stu.getId()+" "+stu.getName());
        }

    }


}
