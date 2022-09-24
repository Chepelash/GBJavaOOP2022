package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Headlight {
    private final String color;
    private boolean isOn;
    public Headlight(String color){
        this.color = color;
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
        System.out.println("Headlight is on...");
    }
    public void turnOff(){
        isOn = false;
        System.out.println("Headlight is off...");
    }
    public boolean isOn(){
        return isOn;
    }

    public String getColor() {
        return color;
    }
}
