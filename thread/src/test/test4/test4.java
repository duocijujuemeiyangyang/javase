package test.test4;



public class test4 {
    /**
     * 抢红包也用到了多线程。
     * 假设:100块，分成了3个包，现在有5个人去抢。
     * 其中，红包是共享数据。5个人是5条线程
     */
    public static void main(String[] args) {
       MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        MyThread myThread4 = new MyThread();
        MyThread myThread5 = new MyThread();
        myThread1.setName("1");
        myThread2.setName("2");
        myThread3.setName("3");
        myThread4.setName("4");
        myThread5.setName("5");
        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
    }
}
