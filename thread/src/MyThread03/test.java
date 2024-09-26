package MyThread03;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class test {
    /**
     * 创建线程的第三种方式，实现callable接口（有返回值）
     * @param args
     * @throws ExecutionException
     * @throws InterruptedException
     */
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread03 myThread03 = new MyThread03();
        FutureTask<Integer>fr=new FutureTask<>(myThread03);
        Thread thread = new Thread(fr);
        thread.start();
        Integer integer = fr.get();
        System.out.println(integer);
    }
}
