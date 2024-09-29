package test.test2;

import java.util.Base64;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    private static int count=100;
    private static final Lock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true){
            lock.lock();
            if (count>10){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName()+"发出去礼物，还剩余"+(count-11)+"份礼物");
                count--;
                lock.unlock();
            }else {
                lock.unlock();
                break;
            }
        }
    }
}
