/**
 * Created by Administrator on 2015/11/7.
 */
public class BubbleSort {

    private void sort(int arr[]) {
        int k=0;
        for (int i = 1; i < arr.length; i++) {
            int flag = 1;
            k++;
            for (int j = 0; j < arr.length - i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println("数组没有变化直接跳出k="+k);
                break;
            }
        }
        show(arr);
    }

    private void show(int arr[]) {
        for (int x : arr) {
            System.out.println(">" + x);
        }
    }

    public static void main(String[] args) {
        int array[] = {1, 77,3, 4, 15, 24, 63};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);

    }
}

/*class kk {
    public BubbleSort k = new BubbleSort();
    int[] array = {63, 4, 24, 1, 3, 15};
    public void fun(){
        k.sort(array);
    }*/

