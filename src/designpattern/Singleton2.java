package designpattern;

/**
 * 静态内部类单例模式
 *
 * 由于 JVM 在加载外部类的过程中, 是不会加载静态内部类的,
 * 只有内部类的属性/方法被调用时才会被加载, 并初始化其静态属性。
 * @author alfred.zhang
 * @date 2021/9/25
 */
public class Singleton2 {

    private Singleton2(){
        System.out.println("Singleton2");
    }

    // 单例持有者
    private static class InstanceHolder{

        private InstanceHolder() {
            System.out.println("InstanceHolder");
        }

        private final static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        // 调用内部类属性
        System.out.println("getInstance");

//        Singleton2 instance = new Singleton2();
//        return instance;
        return InstanceHolder.instance;
    }
}
