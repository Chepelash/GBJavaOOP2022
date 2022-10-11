package ru.chepelash.gb2022.javaoop.homework4;

public class Apple extends Fruit{
    private final double weight = 1.;

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String toString(){
        return "Apple";
    }
}
