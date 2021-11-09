package thread;

/**
 * @author zhangyao12
 */
public class Run {

    public static void main(String[] args) {
//        testRunnable();
//        testVolatile();

        testJoin();

    }

    //
    private static void testJoin() {
        System.out.println("testJoin start.");

        Thread a = new MyThread();
        Thread b = new MyThread();

        try {
            a.start();
            b.start();
            a.join();

            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.printf("InterruptedException");
        }
        System.out.println("testJoin end.");
    }

    private static void testVolatile() {
        int listCount = 100;
        Volatile[] volatileList = new Volatile[listCount];
        for (int i = 0; i < listCount; i++) {
            volatileList[i] = new Volatile();
        }

        try {
            for (Volatile v : volatileList) {
//            v.start();
                v.join();
            }
        } catch (InterruptedException e) {
            System.out.printf("InterruptedException");
        }



        Volatile v1 = new Volatile();
        int count = v1.getCount();

        System.out.println("the final count :" + count);
    }

    private static void testRunnable() {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();
    }
}
