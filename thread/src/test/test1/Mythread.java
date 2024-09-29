package test.test1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Mythread implements Runnable{
    private int count=0;
    private static final Lock lock = new ReentrantLock(); // 初始化锁对象
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                Thread.sleep(30);
                if (count<100){
                    count++;
                    Thread thread = Thread.currentThread();
                    System.out.println(thread.getName()+"售出了第"+count+"张票");
                }else {
                    break;
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }

        }
    }
}
