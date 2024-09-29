package test.test3;



public class test3 {
    /**
     * 同时开启两个线程，共同获取1-100之间的所有数字，要求:将输出所有的奇数。
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread1 = new test.test3.MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("甲");
        myThread2.setName("乙");
        myThread1.start();
        myThread2.start();
    }
}
