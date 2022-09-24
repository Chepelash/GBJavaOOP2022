package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Transmission {
    private int grNumber;

    public void switchGear (int number) {
        this.grNumber = number;
        System.out.printf("Переключение скорости на %d%n", number);
    }

    public int getGrNumber() {
        return grNumber;
    }

}