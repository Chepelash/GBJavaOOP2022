package ru.chepelash.gb2022.javaoop.homework5.calculator.components;

import java.io.PrintStream;
import java.util.Scanner;

public class TerminalView implements View {
    private final Scanner scanner;
    private final PrintStream printStream;

    public TerminalView(Scanner scanner, PrintStream printStream) {
        this.scanner = scanner;
        this.printStream = printStream;
    }

    @Override
    public String getInput(String entryText) {
        printStream.println(entryText);
        return scanner.nextLine();
    }

    @Override
    public void printString(String message) {
        printStream.println(message);
    }
}
