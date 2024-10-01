package MyThread12;


import java.util.concurrent.*;

public class test3 {
    /**
     * 自定义线程池
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        //创建一个没有上限的线程池
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 6, 60, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        //提交任务
        pool.submit(myThread1);
        pool.submit(myThread2);
        pool.submit(myThread3);
        pool.submit(myThread4);

        //销毁线程
        pool.shutdown();
    }
}
