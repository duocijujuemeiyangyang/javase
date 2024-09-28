package MyThread09;

import MyThread03.MyThread03;

public class test {
    public static void main(String[] args) {
        MyThread09 myThread01 = new MyThread09();
        MyThread09 myThread02 = new MyThread09();
        MyThread09 myThread03 = new MyThread09();

        myThread01.setName("窗口1");
        myThread02.setName("窗口2");
        myThread03.setName("窗口3");


        myThread01.start();
        myThread02.start();
        myThread03.start();
    }
}
