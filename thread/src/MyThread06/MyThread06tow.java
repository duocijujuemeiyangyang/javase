package MyThread06;

public class MyThread06tow extends Thread{
    /**
     * 当前为守护线程
     */
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
