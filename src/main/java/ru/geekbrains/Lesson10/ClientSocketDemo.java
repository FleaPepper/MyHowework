package ru.geekbrains.Lesson10;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class ClientSocketDemo {

    public static void main(String[] args) {

        try (Socket socket = new Socket("localhost", 8080);
             DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
             Scanner scanner = new Scanner(System.in)) {

            String msg = "";
            while (!msg.equals("/exit")) {
                System.out.print("Enter your message: ");
                msg = scanner.nextLine();
                outputStream.writeUTF(msg);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
