package ru.chepelash.gb2022.javaoop.homework6;

import ru.chepelash.gb2022.javaoop.homework6.interfaces.Manager;
import ru.chepelash.gb2022.javaoop.homework6.interfaces.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer implements Server {
    private final int port;
    private final Manager manager;
    private ServerSocket serverSocket;

    public FileServer(int port, Manager manager) {
        this.port = port;
        this.manager = manager;
    }
    public FileServer(Manager manager){
        this(8000, manager);
    }

    private void handleRequest() throws IOException {
        boolean running = true;
        while (running) {
            Socket socket = serverSocket.accept();
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter writer = new PrintWriter(socket.getOutputStream())) {
                while (!reader.ready()) ;
                StringBuilder sb = new StringBuilder();
                while (reader.ready()) {
                    sb.append(reader.readLine());
                }
                String request = sb.toString().split(" ")[1].substring(1);
                String response;
                if (request.equalsIgnoreCase("quit")) {
                    response = "Goodbye";
                    running = false;
                } else if (request.equalsIgnoreCase("getFileList")) {
                    response = manager.getFileSet().toString();
                } else if (request.equalsIgnoreCase("getFileLinkList")) {
                    response = manager.getFileLinkSet().toString();
                } else if (manager.isFileExists(request)) {
                    response = manager.readFile(request);
                } else {
                    response = "Unknown request";
                }
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/html; charset=utf-8");
                writer.println();
                writer.println(response);
                writer.flush();
            }
        }
    }
    @Override
    public void run() throws IOException {
        serverSocket = new ServerSocket(port);
        handleRequest();
        serverSocket.close();
    }
}
