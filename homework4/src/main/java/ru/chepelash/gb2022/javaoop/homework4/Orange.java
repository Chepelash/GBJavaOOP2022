package ru.chepelash.gb2022.javaoop.homework4;

public class Orange extends Fruit{
    private final double weight = 1.5;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Orange";
    }
}
