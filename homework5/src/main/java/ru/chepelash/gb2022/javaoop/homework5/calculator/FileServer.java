package ru.chepelash.gb2022.javaoop.homework5.calculator;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileServer {
    public static void runServer(int port) {
        while (true) {
            try (ServerSocket serverSocket = new ServerSocket(port);) {
                Socket socket = serverSocket.accept();
                try (BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream(),StandardCharsets.UTF_8));
                     BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
                    while(!in.ready()){}
                    StringBuilder sb = new StringBuilder();
                    while(in.ready()){
                        sb.append(in.readLine());
                    }
                    String userInput = sb.toString();
                    String fileName = userInput.split(" ")[1];
                    Path path = Paths.get("src/test/resources/" + fileName);
                    String read;
                    try{
                        read =Files.readAllLines(path).get(0);
                    } catch (IOException e){
                        read = "Hello, world";
                    }
                    out.write(read);
                    out.flush();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
