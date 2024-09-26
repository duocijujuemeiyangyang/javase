package MyThread07;

public class MyThread07 extends  Thread{

    static int  num=0;


    @Override
    public void run() {
        while (true){
            synchronized (MyThread07.class){
                if (num<100){
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    num++;
                    System.out.println(this.getName()+"卖出了"+"第"+num+"张票");
                }else {
                    break;
                }
            }
        }
    }
}
