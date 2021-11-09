package sort;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author zhangyao12
 */
public class RunSort {
    public static void main(String[] args) {
        int[] array = {1 , 2 ,4 ,6, 0, 11, 18, 5, 3, 10, 15, 12, 11, 7, 8, 9};
        int[] a;
        a = new int[10];
        int[][] b;
        b = new int[10][10];

        // 冒泡排序
//        BubbleSort.bubbleSort(array);

        // 快速排序
        System.out.println("before");
        print(array);
        QuickSort.quickSort(array, 0, array.length - 1);
        System.out.println("end");
        print(array);

        // 归并排序
//        MergeSort m = new MergeSort();
//        m.mergeSort(array, 0, array.length - 1, new int[array.length]);

        // 插入排序
//        InsertSort insertSort = new InsertSort();
//        insertSort.insertSort(array, array.length);


    }

    private static void print (int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
