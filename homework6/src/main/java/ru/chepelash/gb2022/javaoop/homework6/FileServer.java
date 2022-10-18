package ru.chepelash.gb2022.javaoop.homework6;

import ru.chepelash.gb2022.javaoop.homework6.interfaces.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Path;

public class FileServer implements Server {
    private final String dirName = "/home/virtboy/Documents/GBJavaOOP2022/homework6/src/test/resources/";
    private final int port;
    private ServerSocket serverSocket;

    public FileServer(int port) {
        this.port = port;
    }
    public FileServer(){
        this(8000);
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
                Path of = Path.of(dirName, request);
                if (request.equalsIgnoreCase("quit")) {
                    running = false;
                } else {
                    IOProcessors.PROCESSORS.forEach((pred, processor) ->{
                        if(pred.test(of)){
                            processor.accept(of, writer);
                        }
                    });
                }
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
