package ru.chepelash.gb2022.javaoop.homework2.basic;

import ru.chepelash.gb2022.javaoop.homework2.interfaces.Electric;
import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractCdRom;
import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractKeyboard;
import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractNotebook;
import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractWifiModule;

import java.util.NoSuchElementException;

public class BasicNotebook extends AbstractNotebook implements Electric {
    public BasicNotebook(String model, String vendor, AbstractCdRom cdRom, AbstractKeyboard keyboard, AbstractWifiModule wifiModule) {
        super(model, vendor, cdRom, keyboard, wifiModule);
    }

    @Override
    public void turnOn() {
        if(isWorking()){
            System.out.println("Already working");
            return;
        }
        setWorking(true);
        System.out.println("Notebook powered");
    }

    @Override
    public void turnOff() {
        if(!isWorking()){
            System.out.println("Already off");
        }
        setWorking(false);
        System.out.println("Turned off");
    }
    private boolean checkIfOff(){
        if(!isWorking()){
            System.out.println("Notebook is off");
            return true;
        }
        return false;
    }
    @Override
    public void connectToNetwork(String networkName) {
        if(checkIfOff())
            return;
        getWifiModule().connectToNetwork(networkName);
    }

    @Override
    public void disconnectFromNetwork() {
        if(checkIfOff())
            return;
        getWifiModule().disconnect();
    }

    @Override
    public int getKeyNumber() {
        return getKeyboard().getKeyNumber();
    }

    @Override
    public String getKeyboardType() {
        return getKeyboard().getKeyboardType();
    }

    @Override
    public void clickKeyboard() {
        if(checkIfOff())
            return;
        getKeyboard().clickButton();
    }

    @Override
    public String readData(int dataLength) {
        if(checkIfOff())
            return null;
        try {
            return getCdRom().readData(dataLength);
        } catch (NoSuchElementException e){
            System.out.println("Error reading");
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public void writeData(String data) {
        if(checkIfOff())
            return;
        try{
            getCdRom().writeData(data);
        } catch (IllegalCallerException | UnsupportedOperationException e) {
            System.out.println("Error with writing");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void insertDisk(String diskName, String diskType) {
        if(checkIfOff())
            return;
        try {
            getCdRom().insertDisk(diskName, diskType);
        } catch (UnsupportedOperationException | IllegalArgumentException e){
            System.out.println("Error with disk");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void ejectDisk() {
        if(checkIfOff())
            return;
        getCdRom().ejectDisk();
    }

    @Override
    public boolean isDiskInserted() {
        return getCdRom().isDiskInserted();
    }

    @Override
    public boolean isCdRomCanWrite() {
        return getCdRom().isCanWrite();
    }

    @Override
    public boolean isCdRomWorkingWithDvd() {
        return getCdRom().isWorkingWithDvd();
    }

    @Override
    public boolean isCdRomWorkingWithBlueray() {
        return getCdRom().isWorkingWithBlueray();
    }
}
