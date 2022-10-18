package ru.chepelash.gb2022.javaoop.homework6;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chepelash.gb2022.javaoop.homework6.interfaces.Server;

import java.io.IOException;

class FileServerTest {
    private Server server;
    @BeforeEach
    void setUp() {
        server = new FileServer(8000);
    }

    @Test
    void run() throws IOException {
        server.run();
    }
}