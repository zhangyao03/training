package thread;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangyao12
 */
public class Run {

    public static void main(String[] args) {
        Volatile[] volatileList = new Volatile[100];
        for (int i = 0; i < 100; i++) {
            volatileList[i] = new Volatile();
        }


        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        try {
//            for (Volatile v : volatileList) {
//                v.start();
//                v.join();
//            }

            volatileList[1].start();
            volatileList[1].join();
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("InterruptedException");
        }

        Volatile v1 = new Volatile();
        int count = v1.getCount();

        System.out.println("the final count :" + count);

    }
}
