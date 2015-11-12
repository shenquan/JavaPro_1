package com.han1;

/**
 * Created by Administrator on 2015/11/12.
 */
public class QuadrangleUseInterface {
    public void doAnyThing(){

    }
    public static void main() {
        drawTest[] d = {new S(), new P()};
        for (int i = 0; i < d.length; i++) {
            d[i].draw();
        }
    }
}
interface drawTest{
    void draw();
}
class P extends QuadrangleUseInterface implements drawTest{

    @Override
    public void draw() {
        System.out.println("平行四边形.draw()");
    }
    void doAnything(){

    }
}
class S extends QuadrangleUseInterface implements drawTest{
    public void draw(){
        System.out.println("正方形.draw()");
    }
    void doAnything(){

    }
}
class Any extends QuadrangleUseInterface{
    void doAnything(){

    }
}

