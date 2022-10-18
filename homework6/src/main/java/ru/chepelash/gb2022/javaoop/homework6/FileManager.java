package ru.chepelash.gb2022.javaoop.homework6;

import ru.chepelash.gb2022.javaoop.homework6.interfaces.Manager;

import java.io.IOException;
import java.nio.file.*;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileManager implements Manager {
    private final String baseDir;

    public FileManager(String baseDir) {
        this.baseDir = baseDir.endsWith("/") ? baseDir : baseDir + "/";
    }


    @Override
    public String readFile(String fileName) throws IOException {
        if(!isFileExists(fileName)){
            throw new NoSuchFileException(fileName);
        }
        return Files.readString(Paths.get(baseDir + fileName));
    }

    @Override
    public boolean isFileExists(String fileName) throws IOException {
        Set<String> fileSet = getFileSet();
        return fileSet.contains(fileName);
    }

    @Override
    public Set<String> getFileSet() throws IOException {
        Stream<Path> stream = Files.list(Paths.get(baseDir));
        return stream.filter(file -> !Files.isDirectory(file))
                .map(Path::getFileName)
                .map(Path::toString)
                .collect(Collectors.toSet());
    }
}
