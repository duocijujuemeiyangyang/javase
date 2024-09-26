package MyThread05;

public class MyThread05 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(this.getName()+"："+i);
        }
    }
}
