package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Headlight {
    private final String color;
    private boolean isOn;
    public Headlight(String color){
        this.color = color;
        isOn = false;
    }
    public void turnOn(){
        if(!isOn)
            isOn = true;
    }
    public void turnOff(){
        if(isOn)
            isOn = false;
    }
    public boolean isOn(){
        return isOn;
    }

    public String getColor() {
        return color;
    }
}
