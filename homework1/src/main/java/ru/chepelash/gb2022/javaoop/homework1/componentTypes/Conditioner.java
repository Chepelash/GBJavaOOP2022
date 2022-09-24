package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public abstract class Conditioner {
    private boolean isOn;
    public Conditioner(){
        isOn = false;
    }
    public void turnOn(){
        isOn = true;
    }
    public void turnOff(){
        isOn = false;
    }
    public boolean isEnabled(){
        return isOn;
    }
}
