package MySocket3;

import java.io.IOException;
import java.io.OutputStream;
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
        os.write("我真帅".getBytes());

        os.close();
        socket.close();
    }
}
