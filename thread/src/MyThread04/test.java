package MyThread04;

public class test {
    public static void main(String[] args) throws InterruptedException {
        MyThread04 myThread01 = new MyThread04();
        MyThread04 myThread02 = new MyThread04();

        //thread.set/getName(设置/获取线程的名字)
        myThread01.setName("线程1");
        myThread02.setName("线程2");

        //获取当前线程，当前线程为主线程
        Thread thread = Thread.currentThread();

        //线程休眠，单位为毫秒，1秒=1000毫秒
        Thread.sleep(10000);
    }
}
