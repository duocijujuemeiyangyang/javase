package websocket.src.MySocket2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class SendDemo {
    /**
     * 使用udp发送数据，需要先把数据装成一个包
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        Scanner scanner = new Scanner(System.in);


        while (true){
            String str = scanner.nextLine();
            if ("886".equals(str)){
                break;
            }

        byte[] bytes = str.getBytes();

        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),10086);

        ds.send(dp);

        }

    }
}
