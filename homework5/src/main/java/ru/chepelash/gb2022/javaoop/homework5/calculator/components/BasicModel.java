package ru.chepelash.gb2022.javaoop.homework5.calculator.components;

public class BasicModel implements Model{
    private int first;
    private int second;

    @Override
    public int getSum() {
        return first + second;
    }

    @Override
    public int getDiff() {
        return first - second;
    }

    @Override
    public int getMultiply() {
        return first * second;
    }

    @Override
    public double getDivision() {
        if(second == 0)
            throw new ArithmeticException("Zero division");
        return (double) first / second;
    }

    @Override
    public void setFirst(int first) {
        this.first = first;
    }

    @Override
    public void setSecond(int second) {
        this.second = second;
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
