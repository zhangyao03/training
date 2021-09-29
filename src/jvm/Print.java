package jvm;


import string.StringUtils;

/**
 * JVM参数输出类
 *
 * @author alfred.zhang
 * @date 2019/12/20
 */
public class Print {


    public static void jvmInfo(String keyName) {
        if (StringUtils.isEmpty(keyName)) {
            return;
        }

        System.out.println(keyName + "JVM内存信息:");
        // 最大可用内存，对应-Xmx
        System.out.println(keyName + "最大可用内存(对应-Xmx):" + Runtime.getRuntime().maxMemory()/1024/1024 + "Mb");
        // 当前JVM空闲内存
        System.out.println(keyName + "当前JVM空闲内存:" + Runtime.getRuntime().freeMemory()/1024/1024 + "Mb");
        // 当前JVM占用的内存总数，其值相当于当前JVM已使用的内存及freeMemory()的总和
        System.out.println(keyName + "当前JVM占用的内存:" + Runtime.getRuntime().totalMemory()/1024/1024 + "Mb");


        System.out.println(keyName + "当前JVM可用处理器数量:" + Runtime.getRuntime().availableProcessors());





    }
}
