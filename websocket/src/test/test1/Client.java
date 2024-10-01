package test.test1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    /**
     * 练习一：多发多收
     *
     * 需求：
     *
     * 	客户端：多次发送数据
     *
     * 	服务器：接收多次接收数据，并打印
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream os = socket.getOutputStream();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String str = scanner.nextLine();
            if ("886".equals(str)){
                break;
            }
            os.write(str.getBytes());
        }

        os.close();
        socket.close();
    }
}
