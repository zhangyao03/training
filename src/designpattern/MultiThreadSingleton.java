package designpattern;

/**
 * 线程安全的单例模式
 *
 * volatile 保证线程之间的可见性
 * synchronized
 */
public class MultiThreadSingleton {

    private static volatile MultiThreadSingleton instance;

    public MultiThreadSingleton getInstance() {
        if (instance == null) {
            synchronized (MultiThreadSingleton.class) {
                if (instance == null) {
                    instance = new MultiThreadSingleton();
                }
            }
        }


        return instance;
    }

}
