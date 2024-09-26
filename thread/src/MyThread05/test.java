package MyThread05;

public class test {
    /**
     * 线程的优先级默认都为5，最大可以设置为10，最小为1
     * @param args
     */
    public static void main(String[] args) {
        MyThread05 myThread01 = new MyThread05();
        MyThread05 myThread02 = new MyThread05();
        //打印线程的优先级
        Thread thread = Thread.currentThread();
        System.out.println(thread.getPriority());
        System.out.println(myThread01.getPriority());
        System.out.println(myThread02.getPriority());


        //设置线程的优先级
        myThread01.setPriority(1);
        myThread01.setPriority(10);

        //开启线程
        myThread01.start();
        myThread02.start();
    }
}
