package test.test3;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    private static int count=100;
    private static final Lock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true){
            lock.lock();
            if (count>0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (count%2==1){
                    System.out.println(Thread.currentThread().getName()+":"+count);
                }
                count--;
                lock.unlock();
            }else {
                lock.unlock();
                break;
            }
        }
    }
}
