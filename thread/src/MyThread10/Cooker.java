package MyThread10;

//生产者
public class Cooker extends Thread {

    @Override
    public void run() {
        while (true) {
            synchronized (Desk.lock) {
                //判断是否还能吃
                if (Desk.count == 0) {
                    break;
                }else {
                    if (Desk.flag==0){
                        System.out.println("厨师制作了一碗面");
                        Desk.flag=1;
                        Desk.lock.notifyAll();
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
