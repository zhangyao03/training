package collection;

import jvm.Print;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author alfred.zhang
 * @date 2019/12/19
 */
public class Test {

    public static void main(String[] args) {
        arrayListGrow();
    }


    public static void arrayListGrow() {
        final int N = 10000000;

        HashMap hashMap = new HashMap();


        // 直接初始化大小1937，为啥没有ensureCapacity快？
//        ArrayList<Object> list2 = new ArrayList<Object>(N);
//        long startTime2 = System.currentTimeMillis();
//        for (int i = 0; i < N; i++) {
//            list2.add(i);
//        }
//
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("带有初始化的时间："+(endTime2 - startTime2));

        Print.jvmInfo("arrayListGrow");
        // 自增长1943
        ArrayList<Object> list = new ArrayList<Object>();
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("自增长的耗时："+(endTime - startTime));

        Print.jvmInfo("after");


        // ensureCapacity1960
//        ArrayList<Object> list1 = new ArrayList<Object>();
//        long startTime1 = System.currentTimeMillis();
//        list1.ensureCapacity(N);
//        for (int i = 0; i < N; i++) {
//            list1.add(i);
//        }
//        long endTime1 = System.currentTimeMillis();
//        System.out.println("使用ensureCapacity方法后："+(endTime1 - startTime1));



    }


    public static void base() {


        Object[] elementData = new Object[10];
        System.out.println("elementData.length " + elementData.length);

        try {
            insertElement(elementData, "111", 0);


            // length是输出数组大小，未初始化的也算
            System.out.println("elementData.length " + elementData.length);
            System.out.println("elementData.size " + getSize(elementData));

            int oldCapacity = 10;
            int newCapacity = oldCapacity >> 1;
            System.out.println("newCapacity " + newCapacity);


        } catch (Exception e) {

        }

    }


    private static  <T> void insertElement(T [] list, T element, int index) throws Exception {
        if (index - 1  > list.length) {
            throw new Exception("index out of size");
        }

        list[index] = element;
     }

     private static <T> int getSize(T [] list) {
        if (list == null) {
            return 0;
        }
        int size = 0;

        for (int i = 0; i < list.length -1; i++) {
            if (list[i] != null) {
                size++;
            }
        }
        return size;
     }


}
