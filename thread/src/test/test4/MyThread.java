package test.test4;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    private static double count=100.0;
    private static int num=2;
    public boolean flag=true;
    private static final Lock lock=new ReentrantLock();


    @Override
    public void run() {

            while (true){
                if (this.flag) {
                    lock.lock();
                    if (count > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        if (num > 0) {
                            Random random = new Random();
                            double randomNumber = count * random.nextDouble();
                            num--;
                            System.out.println(Thread.currentThread().getName() + "抢到了" + randomNumber + "元");
                            count = count - randomNumber;
                            this.flag = false;
                        } else {
                            System.out.println(Thread.currentThread().getName() + "抢到了" + count + "元");
                            count = 0;
                            this.flag = false;
                        }
                        lock.unlock();
                    } else {
                        System.out.println(Thread.currentThread().getName() + "抢到了" + count + "元");
                        this.flag = false;
                        lock.unlock();
                        break;
                    }
                }else {
                    break;
                }
            }
    }
}
