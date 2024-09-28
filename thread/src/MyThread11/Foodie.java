package MyThread11;


import java.util.concurrent.ArrayBlockingQueue;

//消费者
public class Foodie extends Thread{
    //需要一个共同的阻塞队列作为参数
    private ArrayBlockingQueue<String> db;

    public Foodie(ArrayBlockingQueue<String> db) {
        this.db=db;
    }
    @Override
    public void run() {
        while (true){
            //方法会自动判断队列是否已满，未满则会往里面添加数据
            try {
                String take = db.take();
                System.out.println("消费者吃掉了一个"+take);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
