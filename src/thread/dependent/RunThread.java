package thread.dependent;

/**
 * @author alfred.zhang
 * @date 2021/10/26
 */
public class RunThread {

    public static void main(String[] args) {
        try {
            Thread a = new MyThread("a", 500);
            Thread b = new MyThread("b", 300);
            Thread c = new MyThread("c", 100);

            a.start();
            a.join();

            b.start();
            b.join();

            c.start();

        } catch (InterruptedException e) {
            System.out.println("main InterruptedException");
        }

    }
}
