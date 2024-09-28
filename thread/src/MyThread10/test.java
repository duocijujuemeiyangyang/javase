package MyThread10;

public class test {
    public static void main(String[] args) {
        Cooker cooker = new Cooker();
        Foodie foodie = new Foodie();

        cooker.setName("生产者");
        foodie.setName("消费者");



        cooker.start();
        foodie.start();
    }
}
