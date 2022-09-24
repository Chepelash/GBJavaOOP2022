package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

import java.util.List;

public class Door {
    private Window window;
    private boolean isOpened;
    public Door(Window window){
        this.window = window;
        isOpened = false;
    }

    public boolean isOpened() {
        return isOpened;
    }
    public void openDoor(){
        isOpened = true;
    }
    public void closeDoor(){
        isOpened = false;
    }
    public void openWindow(){
        if(!window.isOpened())
            window.open();
    }
    public void closeWindow(){
        if(window.isOpened())
            window.close();
    }
}
