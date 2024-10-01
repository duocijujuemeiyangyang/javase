package MyThread12;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class test {
    /**
     * 使用Executors创建一个没有上线的线程
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        //创建一个没有上限的线程池
        ExecutorService pool = Executors.newCachedThreadPool();
        //提交任务
        pool.submit(myThread1);
        pool.submit(myThread2);
        pool.submit(myThread3);
        pool.submit(myThread4);

        //销毁线程
        pool.shutdown();
    }
}
