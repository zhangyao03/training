package designpattern;

/**
 * 双重检查锁
 *
 * volatile 保证线程之间的可见性
 * synchronized
 */
public class Singleton1 {

    private static volatile Singleton1 instance;

    public Singleton1 getInstance() {
        if (instance == null) {
            synchronized (Singleton1.class) {
                if (instance == null) {
                    instance = new Singleton1();
                }
            }
        }


        return instance;
    }

}
