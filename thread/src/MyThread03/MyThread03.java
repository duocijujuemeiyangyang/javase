package MyThread03;

import java.util.concurrent.Callable;

public class MyThread03 implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int num=0;
        for (int i = 0; i < 100; i++) {
            num=num+i;
        }
        return num;
    }
}
