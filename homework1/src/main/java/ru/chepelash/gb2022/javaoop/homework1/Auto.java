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

    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract boolean isEngineStarted();
    public abstract void startDriving();
    public abstract void stopDriving();

    public abstract void changeTransmission(int gear);
    public abstract void openWindow(int doorIndex);
    public abstract void closeWindow(int doorIndex);
    public abstract void openDoor(int doorIndex);
    public abstract void closeDoor(int doorIndex);

    public List<Door> getDoors() {
        return doors;
    }

    public List<Wheel> getWheels() {
        return wheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public Headlight getHeadlight() {
        return headlight;
    }

    public void setDriving(boolean driving) {
        this.driving = driving;
    }

    public boolean isDriving() {
        return driving;
    }
}
