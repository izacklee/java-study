package cn.itcast.day11.demo01;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    TCP通信的服务端：接收客户端的请求，读取客户端发送的数据，给客户端回写数据
    表示服务器的类：
        java.net.ServerSocket：此类实现服务器套接字。

    构造方法：
        ServerSocket(int port) ：创建绑定到特定端口的服务器套接字。

    服务器必须明确一件事情，必须得知道是哪个客户端请求的服务器
    所以可以使用accept方法获取到客户端请求的Socket
    成员方法：
        Socket	accept() ：侦听并接受到此套接字的连接。

    实现步骤：
        1.创建服务器ServerSocket对象，指定系统端口号
        2.使用ServerSocket对象中的方法accept，获取请求的客户端对象Socket
        3.使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        4.使用网络字节输入流InputStream中的read方法，读取客户端发送的数据
        5.使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
        6.使用网络字节输出流OutputStream中的write方法，给客户端回写数据
        7.释放资源（Socket，ServerSocket）
*/
public class TCPServer {

    public static void main(String[] args) throws IOException {
        // 1.创建服务器ServerSocket对象，指定系统端口号
        ServerSocket server = new ServerSocket(8888);
        // 2.使用ServerSocket对象中的方法accept，获取请求的客户端对象Socket
        Socket socket = server.accept();
        // 3.使用Socket对象中的方法getInputStream获取网络字节输入流InputStream对象
        InputStream is = socket.getInputStream();
        // 4.使用网络字节输入流InputStream中的read方法，读取客户端发送的数据
        byte[] bytes = new byte[1024];
        int len = is.read(bytes);
        System.out.println(new String(bytes,0, len));
        // 5.使用Socket对象中的方法getOutputStream获取网络字节输出流OutputStream对象
        // 6.使用网络字节输出流OutputStream中的write方法，给客户端回写数据
        socket.getOutputStream().write("收到谢谢".getBytes());

        // 7.释放资源（Socket，ServerSocket）
        socket.close();
        server.close();
    }

}
