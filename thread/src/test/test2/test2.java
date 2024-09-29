package test.test2;

public class test2 {
    /**
     * 有100份礼品,两人同时发送，当剩下的礼品小于10份的时候则不再送出利用多线程模拟该过程并将线程的名字和礼物的剩余数量打印出来
     * @param args
     */
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.setName("甲");
        myThread2.setName("乙");
        myThread1.start();
        myThread2.start();
    }
}
