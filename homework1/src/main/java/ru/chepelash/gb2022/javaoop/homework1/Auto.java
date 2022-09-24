package ru.chepelash.gb2022.javaoop.homework1;

import ru.chepelash.gb2022.javaoop.homework1.componentTypes.*;

import java.util.List;

public abstract class Auto {
    private List<Door> doors;
    private List<Wheel> wheels;
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Transmission transmission;
    private Headlight headlight;
    private boolean driving;

    public Auto(List<Door> doors, List<Wheel> wheels, Engine engine,
                SteeringWheel steeringWheel, Transmission transmission,
                Headlight headlight) {
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.transmission = transmission;
        this.headlight = headlight;
        driving = false;
    }

    public void startEngine(){
        engine.start();
    }
    public void stopEngine(){
        engine.stop();
    }
    public abstract boolean isEngineStarted();
    public void startDriving(){
        if(engine.getWork())
            driving = true;
    }
    public void stopDriving(){
        driving = false;
    }
    public boolean isDriving(){
        return driving;
    }
    public abstract void changeTransmission(int gear);
    public abstract boolean openWindow(int windowIndex);

}
