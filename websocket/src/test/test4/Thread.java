package websocket.src.test.test4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Thread extends java.lang.Thread {

    ServerSocket ss=null;

    public Thread(ServerSocket ss) {
        this.ss=ss;
    }

    @Override
    public void run()  {
        try {
            //2.等待客户端来连接
            Socket socket = ss.accept();

            //3.读取数据并保存到本地文件中
            BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("websocket\\网络编程2.md"));
            int len;
            byte[] bytes = new byte[2048];
            while ((len = bis.read(bytes)) != -1){
                bos.write(bytes,0,len);
            }
            bos.close();
            //4.回写数据
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bw.write("上传成功");
            bw.newLine();
            bw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
