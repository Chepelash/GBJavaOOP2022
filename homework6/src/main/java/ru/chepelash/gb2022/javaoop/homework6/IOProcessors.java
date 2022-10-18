package ru.chepelash.gb2022.javaoop.homework6;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOProcessors {
    public static final Map<Predicate<Path>, BiConsumer<Path, PrintWriter>> PROCESSORS = Map.of(
            Files::notExists,
            (path, writer) -> {
                writer.println("HTTP/1.1 404 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("<h1>File " + path + " not found!</h1>");
            },
            Files::isDirectory,
            (path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("<h1>It's a directory</h1>");
                try {
                    writer.println(Files.list(path)
                            .map(Path::getFileName)
                            .map(Path::toString)
                            .map(fileName -> path + "/" + fileName)
                            .collect(Collectors.toSet()));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            },
            file -> !Files.isReadable(file),
            (path, writer) -> {
                writer.println("HTTP/1.1 403 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("<h1>File " + path + " is not readable!</h1>");
            },
            Files::isRegularFile,
            (path, writer) -> {
                writer.println("HTTP/1.1 200 OK");
                writer.println("Content-Type: text/http; charset=utf-8");
                writer.println();
                writer.println("<h1>It's a file</h1>");
                try {
                    Files.newBufferedReader(path).transferTo(writer);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    );
}
