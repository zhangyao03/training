package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/**
 *
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("Xmx");
        System.out.println(Runtime.getRuntime().maxMemory()/1024/1024);

        String a1 = "hello";
        String a2 = "hello";
        String a3 = new String("hello");
        String a4 = new String("hello");
        System.out.println(a1 == a2);
        System.out.println(a3 == a4);
        System.out.println(a1 == a3);

        System.out.println("");


        Integer i1 = 200;
        Integer i2 = 200;
        Integer i3 = new Integer(200);
        Integer i4 = new Integer(200);
        Integer i5 = 127;
        Integer i6 = 127;
        Integer i7 = new Integer(127);
        Integer i8 = new Integer(127);
        System.out.println(i1 == i2);
        System.out.println(i3 == i4);
        System.out.println(i1 == i3);
        System.out.println(i5 == i6);
        System.out.println(i7 == i8);
        i1.equals(i2);

        StringBuilder stringBuilder = new StringBuilder("aaa");
        String string = new String("aaa");
        StringBuffer stringBuffer = new StringBuffer("aaa");


        Integer integer = new Integer(100);

        Object o = new Object();

        ArrayList<String> arrayList = new ArrayList<>(1);
        Vector<String> vector = new Vector<>();
        LinkedList<String> linkedList = new LinkedList<>();


        arrayList.add("aaa");
        vector.add("aaa");
        linkedList.add("aaa");

        try {

        } catch (Exception e) {

        }

        HashMap<String, String> hashMap = new HashMap<>();
        Hashtable<String, String> hashTable = new Hashtable<>();
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();

    }
}
