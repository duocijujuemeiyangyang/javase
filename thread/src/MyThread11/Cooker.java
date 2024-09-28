package MyThread11;

import java.util.concurrent.ArrayBlockingQueue;

//生产者
public class Cooker extends Thread{
    //需要一个共同的阻塞队列作为参数
    private ArrayBlockingQueue<String>db;

    public Cooker(ArrayBlockingQueue<String> db) {
        this.db=db;
    }

    @Override
    public void run() {
        while (true){
            //方法会自动判断队列是否已满，未满则会往里面添加数据
            try {
                db.put("汉堡包");
                System.out.println("厨师放入了一个汉堡包");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
