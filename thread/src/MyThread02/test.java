package MyThread02;

public class test {
    /**
     * 创建线程的第二种方式实现runnable接口
     * @param args
     */
    public static void main(String[] args) {
        Mythread02 mythread02 = new Mythread02();
        Thread thread = new Thread(mythread02);
        thread.start();
    }
}
