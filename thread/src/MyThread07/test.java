package MyThread07;

public class test {
    /**
     * 使用同步代码块限制静态资源的访问
     * @param args
     */
    public static void main(String[] args) {
        MyThread07 thread01 = new MyThread07();
        MyThread07 thread02 = new MyThread07();
        MyThread07 thread03 = new MyThread07();
        thread01.setName("窗口1");
        thread02.setName("窗口2");
        thread03.setName("窗口3");

        thread01.start();
        thread02.start();
        thread03.start();
    }
}
