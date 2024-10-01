package test.test2;

import java.io.*;
import java.net.Socket;

public class Client {

    /**
     * tcp客户端建立连接，如果连接建立失败会直接抛出异常
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream os = socket.getOutputStream();
        os.write("我要链接了".getBytes());
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        int b=0;
        while ((b=(br.read()))!=-1){
            System.out.println((char) b);
        }



        is.close();
        os.close();
        socket.close();
    }
}
