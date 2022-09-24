package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Transmission {
    private int grNumber;
    private int maxGear;
    public Transmission(int maxGear){
        this.maxGear = maxGear;
        grNumber = 0;
    }
    public void switchGear (int number) {
        if(number > maxGear){
            System.out.printf("Cannot go beyond max gear %d\n", maxGear);
            return;
        }
        if (number < 0){
            System.out.println("Gear number < 0!");
            return;
        }
        this.grNumber = number;
        System.out.printf("Переключение скорости на %d%n", number);
    }

    public int getGrNumber() {
        return grNumber;
    }

}
