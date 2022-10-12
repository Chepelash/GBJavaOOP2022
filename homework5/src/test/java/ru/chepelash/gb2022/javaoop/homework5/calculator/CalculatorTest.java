package ru.chepelash.gb2022.javaoop.homework5.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chepelash.gb2022.javaoop.homework5.calculator.components.*;

import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Model model = new BasicModel();
    View view = new TerminalView(new Scanner(System.in), new PrintStream(System.out));
    Presenter presenter = new BasicPresenter(view, model);
    Calculator calculator = new Calculator(view, model, presenter);

    @Test
    void run() {
        calculator.run();
    }
}