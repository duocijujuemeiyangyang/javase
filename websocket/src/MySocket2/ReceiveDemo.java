package websocket.src.MySocket2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceiveDemo {
    /**
     * udp接收数据
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //绑定端口号
        DatagramSocket ds = new DatagramSocket(10086);
        //创建一个接收数组
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);

        while (true){
            //这个方法会阻塞 知道接收到数据为止
            ds.receive(dp);
            if ("886".equals(new String(dp.getData()))){
                break;
            }

            System.out.println(new String(dp.getData(), 0, dp.getLength()));

        }
        ds.close();
    }
}
