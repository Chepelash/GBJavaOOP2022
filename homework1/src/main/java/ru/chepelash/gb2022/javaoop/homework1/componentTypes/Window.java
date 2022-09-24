package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Window {
    private boolean isOpened;
    public Window(){
        isOpened = false;
    }

    public boolean isOpened() {
        return isOpened;
    }
    public void open(){
        isOpened = true;
    }
    public void close(){
        isOpened = false;
    }
}
