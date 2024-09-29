package test.test1;

public class test1 {
    /**
     * -共有1000张电影票,可以在两个窗口领取,假设每次领取的时间为3000毫秒要求:请用多线程模拟卖票过程并打印剩余电影票的数量
     * @param args
     */
    public static void main(String[] args) {
        Mythread Mythread = new Mythread();


        new Thread(Mythread,"窗口1").start();
        new Thread(Mythread,"窗口2").start();
        new Thread(Mythread,"窗口3").start();

    }
}
