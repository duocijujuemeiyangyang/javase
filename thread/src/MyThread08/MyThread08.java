package MyThread08;

import java.lang.annotation.ElementType;

public class MyThread08 implements Runnable {
    private int count = 0;

    @Override
    public void run() {
        while (true) {
                if (extracted()) break;
        }
    }

    private synchronized boolean extracted() {
        if (count < 100) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                count++;
                Thread thread = Thread.currentThread();
                System.out.println(thread.getName() + "出售了第" + count + "张票");
        } else {
            return true;
        }
        return false;
    }


}
