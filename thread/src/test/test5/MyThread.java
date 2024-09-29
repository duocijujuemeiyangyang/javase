package test.test5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.stream.Collectors;

public class MyThread extends Thread{
    public static Integer[] arr={10,5,20,50,100,200,500,800,2,80,300,700};
    public static int num=0;
    public static final Lock lock=new ReentrantLock();


    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                Thread.sleep(300);
                if (arr.length==num){
                    break;
                }else {
                    // 转换为列表并打乱
                    List<Integer> list = Arrays.asList(arr);
                    Collections.shuffle(list);
                    if (list.get(0)!=0){
                        System.out.println(Thread.currentThread().getName()+"抽到了"+list.get(0)+"元");
                        list.set(0,0);
                        this.num++;
                    }
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }finally {
                lock.unlock();
            }

        }
    }
}
