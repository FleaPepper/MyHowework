package ru.geekbrains.Lesson10;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo {

    public static void main(String[] args) {

        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();
            String msg = "";
            try (DataInputStream inputStream = new DataInputStream(socket.getInputStream())) {
                while (!msg.equals("/exit")) {
                        msg = inputStream.readUTF();
                        System.out.println(msg);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
