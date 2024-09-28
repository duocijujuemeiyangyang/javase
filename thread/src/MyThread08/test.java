package MyThread08;

public class test {
    public static void main(String[] args) {
        MyThread08 myThread08 = new MyThread08();
        Thread thread1 = new Thread(myThread08);
        Thread thread2 = new Thread(myThread08);
        Thread thread3 = new Thread(myThread08);

        thread1.setName("窗口1");
        thread2.setName("窗口2");
        thread3.setName("窗口3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
