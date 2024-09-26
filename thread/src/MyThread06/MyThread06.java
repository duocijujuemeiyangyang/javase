package MyThread06;

public class MyThread06 extends Thread{
    /**
     * 当前为非守护线程
     */
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getName()+":"+i);
        }
    }
}
