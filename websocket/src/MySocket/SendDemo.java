package MySocket;

import java.io.IOException;
import java.net.*;

public class SendDemo {
    /**
     * 使用udp发送数据，需要先把数据装成一个包
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        //创建发送端的Socket对象(DatagramSocket)
        DatagramSocket ds = new DatagramSocket();
        // DatagramSocket() 构造数据报套接字并将其绑定到本地主机上的任何可用端口

        //创建数据，并把数据打包
        //DatagramPacket(byte[] buf, int length, InetAddress address, int port)
        //构造一个数据包，发送长度为 length的数据包到指定主机上的指定端口号。
        byte[] bytes = "hello,udp,我来了".getBytes();

        DatagramPacket dp=new DatagramPacket(bytes,bytes.length,InetAddress.getByName("127.0.0.1"),10086);

        //调用DatagramSocket对象的方法发送数据
        //void send(DatagramPacket p) 从此套接字发送数据报包
        ds.send(dp);
        //关闭发送端
        //void close() 关闭此数据报套接字
        ds.close();

    }
}
