package MyThread01;

public class test {
    /**
     * 创建线程的第一种方式，继承thread父类
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        MyThread01 thread01=new MyThread01();
        thread01.start();
        System.out.println("我执行了");
    }
}
