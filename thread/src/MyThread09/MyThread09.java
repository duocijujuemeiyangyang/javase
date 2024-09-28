package MyThread09;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread09 extends Thread{
    private  static int count=0;
    private  static Lock lock=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                Thread.sleep(100);
                if (count==100){
                    break;
                }else {
                    count++;
                    System.out.println(this.getName()+"售出了第"+count+"张票");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }

        }
    }
}
