package thread.dependent;

/**
 * @author alfred.zhang
 * @date 2021/10/26
 */
public class MyThread extends Thread {

    public MyThread () {

    }

    public MyThread (String threadName, Integer threadRunTime) {
        this.threadName = threadName;
        this.threadRunTime = threadRunTime;

    }

    private String threadName;
    private Integer threadRunTime;

    private static final Integer DEFAULT_RUN_TIME = 100;


    @Override
    public void run () {
        System.out.println("Thread:" + threadName + " start.");
        try {
            if (threadRunTime == null || threadRunTime < 1) {
                Thread.sleep(DEFAULT_RUN_TIME);

            } else {
                Thread.sleep(threadRunTime);
            }
        } catch (InterruptedException e) {
            System.out.println("InterruptedException:" + threadName);

        }
        System.out.println("Thread:" + threadName + " end.");
    }
}
