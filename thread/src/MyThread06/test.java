package MyThread06;

public class test {
    public static void main(String[] args) {
        //开启非守护线程
        MyThread06 myThread06 = new MyThread06();
        myThread06.setPriority(1);

        //开启守护线程
        MyThread06tow myThread06tow = new MyThread06tow();

        myThread06tow.setDaemon(true);
        myThread06tow.setPriority(10);
        myThread06tow.start();
        myThread06.start();
    }
}
