package ru.chepelash.gb2022.javaoop.homework5.calculator.components;

public interface Model {
    int getSum();
    int getDiff();
    int getMultiply();
    double getDivision();
    void setFirst(int first);
    void setSecond(int second);
    int getFirst();
    int getSecond();

}
