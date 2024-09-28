package MyThread11;

import java.util.concurrent.ArrayBlockingQueue;

public class Demo {
    public static void main(String[] args) {
        //定义了一个容量只有1的数组作为阻塞队列
         ArrayBlockingQueue<String> db=new ArrayBlockingQueue<>(1);
        Cooker cooker = new Cooker(db);
        Foodie foodie = new Foodie(db);

        cooker.start();
        foodie.start();
    }

}
