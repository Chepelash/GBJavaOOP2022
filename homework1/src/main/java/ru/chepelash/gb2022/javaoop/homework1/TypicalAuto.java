package ru.chepelash.gb2022.javaoop.homework1;

import ru.chepelash.gb2022.javaoop.homework1.componentTypes.*;

import java.util.ArrayList;
import java.util.List;

public class TypicalAuto extends Auto{

    public TypicalAuto(List<Door> doors, List<Wheel> wheels, Engine engine,
                       SteeringWheel steeringWheel, Transmission transmission, Headlight headlight) {
        super(doors, wheels, engine, steeringWheel, transmission, headlight);
    }

    @Override
    public void startEngine() {
        if(isEngineStarted()){
            System.out.println("Engine is already on");
        } else {
            System.out.println("Starting engine");
            super.getEngine().start();
        }
    }

    @Override
    public void stopEngine() {
        if(super.isDriving()){
            System.out.println("Cannot stop engine while driving!");
        } else {
            super.getEngine().stop();
            System.out.println("Engine is stopped");
        }
    }

    @Override
    public boolean isEngineStarted() {
        return super.getEngine().getWork();
    }

    @Override
    public void startDriving() {
        if(!isEngineStarted()){
            System.out.println("Engine is off!");
            return;
        }
        for (Door door:
                getDoors()) {
            if(door.isOpened()){
                System.out.printf("Door %d is opened!\n", getDoors().indexOf(door));
                return;
            }
        }
        if(!super.isDriving()) {
            super.setDriving(true);
            System.out.println("Start driving");
        } else {
            System.out.println("Already moving");
        }

    }

    @Override
    public void stopDriving() {
        if(super.isDriving()) {
            super.setDriving(false);
            System.out.println("Stopped driving");
        } else {
            System.out.println("Already standing");
        }
    }

    @Override
    public void changeTransmission(int gear) {
        super.getTransmission().switchGear(gear);
    }

    @Override
    public void openWindow(int doorIndex) {
        super.getDoors().get(doorIndex).openWindow();
    }

    @Override
    public void closeWindow(int doorIndex) {
        super.getDoors().get(doorIndex).closeWindow();
    }

    @Override
    public void openDoor(int doorIndex){
        if(super.isDriving()){
            System.out.println("Cannot open door while driving!");
            return;
        }
        super.getDoors().get(doorIndex).openDoor();
    }

    @Override
    public void closeDoor(int doorIndex){
        super.getDoors().get(doorIndex).closeDoor();
    }
}
