package thread;

/**
 * @author zhangyao12
 * 此例说明
 * volatile修饰的变量并不保证对它的操作（自增）具有原子性。
 * 对于自增操作，可以使用JAVA的原子类AutoicInteger类保证原子自增
 */
public class Volatile extends Thread {
//    private static volatile int count = 0;
    private static int count = 0;

    public int getCount() {
        return count;
    }

    public static void addCount() {
        for (int i = 0; i < 100; i++) {
            count++;
            try {
                sleep(1);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    @Override
    public void run() {
        addCount();
    }
}

