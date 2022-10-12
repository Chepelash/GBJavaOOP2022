package ru.chepelash.gb2022.javaoop.homework5.calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileServerTest {

    @Test
    void runServer() {
        FileServer.runServer(8080);
    }
}