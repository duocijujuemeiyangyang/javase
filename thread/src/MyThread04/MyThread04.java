package MyThread04;

public class MyThread04 extends Thread{
    @Override
    public void run() {
        System.out.println(this.getName()+"执行了");
    }
}
