package MyThread02;

public class Mythread02 implements Runnable{
    @Override
    public void run() {
        //获取执行到这里的线程对象
        Thread thread = Thread.currentThread();
        for (int i = 0; i < 100; i++) {
            System.out.println(thread.getName()+i);
        }
    }
}
