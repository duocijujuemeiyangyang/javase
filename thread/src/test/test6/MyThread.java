package test.test6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MyThread extends Thread{
    public static Integer[] arr={10,5,20,50,100,200,500,800,2,80,300,700};
    public static List<Integer> arr1=new ArrayList<>();
    public static List<Integer> arr2=new ArrayList<>();
    public static int num=0;
    public static final Lock lock=new ReentrantLock();
    public int flag;



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
                        //System.out.println(Thread.currentThread().getName()+"抽到了"+list.get(0)+"元");
                        if (1==this.flag){
                            arr1.add(list.get(0));
                        }else {
                            arr2.add(list.get(0));
                        }
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

    public MyThread(String s, int flag) {
        super(s);
        this.flag = flag;
    }
}
