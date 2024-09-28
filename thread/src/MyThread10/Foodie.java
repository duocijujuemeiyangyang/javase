package MyThread10;

//消费者
public class Foodie extends Thread{
    @Override
    public void run() {

        while (true){
            synchronized (Desk.lock){
                if (Desk.count==0){
                    break;
                }else {
                    if (Desk.flag==1){
                        System.out.println("消费者吃了一碗面还可以吃"+(Desk.count-1)+"碗");
                        Desk.flag=0;
                        Desk.lock.notifyAll();
                        Desk.count--;
                    }else {
                        try {
                            Desk.lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
        }

    }
}
