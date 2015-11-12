
/**
 * Created by Administrator on 2015/11/12.
 */
package com.lzw;
import static java.lang.Math.max;
import static java.lang.System.out;
public class ImportTest {
    private static final int[] a={1 , 2};
    final static int B=0;
    public static void main(String [] args){
        out.println("1和4的较大值为:"+max(1,4));
        for(int i=0;i<a.length;i++){
            a[i]=3;
            out.println(a[i]);
        }
//        B=4;
    }
}
