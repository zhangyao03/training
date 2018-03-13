package thread;

/**
 * @author zhangyao12
 */
public class Run {

    public static void main(String[] args) {
        Volatile[] volatileList = new Volatile[100];
        for (int i = 0; i < 100; i++) {
            volatileList[i] = new Volatile();
        }

        for (Volatile v : volatileList) {
            v.start();
        }

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.printf("InterruptedException");
        }

        Volatile v1 = new Volatile();
        int count = v1.getCount();

        System.out.println("the final count :" + count);
    }
}
