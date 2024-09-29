package test.test6;

import java.util.List;

public class test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("抽奖箱1",1);
        MyThread myThread2 = new MyThread("抽奖箱2",2);
        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        List<Integer> arr1 = myThread1.arr1;
        // 求最大值
        Integer max = arr1.stream()
                .max(Integer::compareTo)
                .orElse(null); // 如果列表为空，返回 null
        // 求总和
        Integer sum = arr1.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("在此次抽奖中，抽奖箱1总共产生"+arr1.size()+"个奖项"+arr1.toString()+"最高奖项为"+max+"，元总计金额为"+sum);

        List<Integer> arr2 = myThread1.arr2;

        // 求最大值
        Integer max2 = arr2.stream()
                .max(Integer::compareTo)
                .orElse(null); // 如果列表为空，返回 null
        // 求总和
        Integer sum2 = arr2.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println("在此次抽奖中，抽奖箱2总共产生"+arr2.size()+"个奖项"+arr2.toString()+"最高奖项为"+max2+"，元总计金额为"+sum2);


    }
}
