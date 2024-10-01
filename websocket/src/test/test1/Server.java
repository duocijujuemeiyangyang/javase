package test.test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    /**
     * tcp服务端接收数据
     */
    public static void main(String[] args) throws IOException {
        //创建对象serversocker
        ServerSocket ss = new ServerSocket(10086);
        while (true){

        //监听客户端连接
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        int b=0;
        while ((b=(br.read()))!=-1){
            System.out.print((char) b);
        }
        socket.close();
        ss.close();
        }

    }
}
