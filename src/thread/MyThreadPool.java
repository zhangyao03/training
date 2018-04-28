package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 *
 */
public class MyThreadPool {


    public void executePool() {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 20, 200, )

        ExecutorService cachedThreadPoolExecutor = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPoolExecutor = Executors.newFixedThreadPool(5);
        ExecutorService scheduledThreadPoolExecutor = Executors.newScheduledThreadPool(5);
        ExecutorService singleThreadPoolExecutor = Executors.newSingleThreadExecutor();

        fixedThreadPoolExecutor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.printf("fixed 线程池");
            }
        });

    }
}
