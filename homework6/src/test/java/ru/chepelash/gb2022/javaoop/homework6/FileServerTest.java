package ru.chepelash.gb2022.javaoop.homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chepelash.gb2022.javaoop.homework6.interfaces.Manager;
import ru.chepelash.gb2022.javaoop.homework6.interfaces.Server;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileServerTest {
    private Manager manager;
    private Server server;
    @BeforeEach
    void setUp() {
        manager = new FileManager("src/test/resources/");
        server = new FileServer(8000, manager);
    }

    @Test
    void run() throws IOException {
        server.run();
    }
}