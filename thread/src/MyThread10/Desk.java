package MyThread10;

public class Desk {
    //标记标识当前桌子上没有事物
    public static  int flag=0;

    //表示消费者可以吃10碗
    public  static int count=10;


    //定义一个通用锁对象
    public  static final Object lock=new Object();

}
