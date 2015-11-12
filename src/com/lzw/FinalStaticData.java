package com.lzw;

/**
 * Created by Administrator on 2015/11/12.
 */
import java.util.Random;
import static java.lang.System.out;
public class FinalStaticData {
    private static Random rand =new Random();
    private final int a1=rand.nextInt(10);
    private final static int a2=rand.nextInt(10);
    final int FF;
private final void te(){

}
    public FinalStaticData() {
        FF=3;
    }

    public static void main(String[]args){
        FinalStaticData fdata=new FinalStaticData();
        out.println(fdata.a1);
        out.println(fdata.a2);
        FinalStaticData fdata2=new FinalStaticData();
        out.println(fdata2.a1);
        out.println(fdata2.a2);
    }
}
