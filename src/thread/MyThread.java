package thread;

/**
 * @author alfred.zhang
 * @date 2021/10/24
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("my thread start!");
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
        System.out.println("my thread end!");
    }
}
