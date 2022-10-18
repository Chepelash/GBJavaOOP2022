package ru.chepelash.gb2022.javaoop.homework6;

import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class IOProcessors {
    public static final Map<Predicate<Path>, BiConsumer<Path, PrintWriter>> PROCESSORS = Map.of(
            Files::notExists,
            (path, writer) -> {
                writer.println("HTTP/1.1 404 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("File " + path + " not found!");
            },
            Files::isDirectory,
            (path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("It's a directory");
                // TODO
            },
            file -> !Files.isReadable(file),
            (path, writer) -> {
                writer.println("HTTP/1.1 403 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("File " + path + " is not readable!");
            },
            Files::isRegularFile,
            (path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("It's a file");
                // TODO
            }
    );
}
