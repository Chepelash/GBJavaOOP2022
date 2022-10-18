package ru.chepelash.gb2022.javaoop.homework6.interfaces;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.util.Set;

public interface Manager {
    String readFile(String fileName) throws IOException;
    boolean isFileExists(String fileName) throws IOException;
    Set<String> getFileSet() throws IOException;
    Set<String> getFileLinkSet() throws IOException;
}
