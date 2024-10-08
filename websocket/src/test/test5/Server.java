package test.test5;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.concurrent.*;

public class Server {
    public static void main(String[] args) throws IOException {
        //客户端：将本地文件上传到服务器。接收服务器的反馈。
        //服务器：接收客户端上传的文件，上传完毕之后给出反馈。


        //1.创建对象并绑定端口
        ServerSocket ss = new ServerSocket(10086);
        ThreadPoolExecutor pool = new ThreadPoolExecutor(3, 24, 60, TimeUnit.SECONDS, new ArrayBlockingQueue<>(3), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        pool.submit(new websocket.src.test.test5.MyThread(ss));


    }
}