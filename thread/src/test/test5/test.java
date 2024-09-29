package test.test5;

public class test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("抽奖箱1");
        myThread2.setName("抽奖箱2");
        myThread1.start();
        myThread2.start();
    }
}
