package ru.chepelash.gb2022.javaoop.homework2.abstractClasses;

import interfaces.Electric;

public abstract class AbstractNotebook implements Electric {
    private final String model;
    private final String vendor;

    private AbstractCdRom cdRom;
    private AbstractKeyboard keyboard;
    private AbstractWifiModule wifiModule;
    private boolean isWorking;

    protected void setWorking(boolean working) {
        isWorking = working;
    }

    public AbstractNotebook(String model, String vendor, AbstractCdRom cdRom, AbstractKeyboard keyboard, AbstractWifiModule wifiModule) {
        this.model = model;
        this.vendor = vendor;
        this.cdRom = cdRom;
        this.keyboard = keyboard;
        this.wifiModule = wifiModule;
        isWorking = false;
    }
    public boolean isWorking(){
        return isWorking;
    }

    public abstract void connectToNetwork(String networkName);
    public abstract void disconnectFromNetwork();

    public abstract int getKeyNumber();
    public abstract String getKeyboardType();
    public abstract void clickKeyboard();

    public abstract String readData(int dataLength);
    public abstract void writeData(String data);
    public abstract void insertDisk(String diskName, String diskType);
    public abstract void ejectDisk();
    public abstract boolean isDiskInserted();
    public abstract boolean isCdRomCanWrite();
    public abstract boolean isCdRomWorkingWithDvd();
    public abstract boolean isCdRomWorkingWithBlueray();

    public String getModel() {
        return model;
    }

    public String getVendor() {
        return vendor;
    }

    protected AbstractCdRom getCdRom() {
        return cdRom;
    }

    protected AbstractKeyboard getKeyboard() {
        return keyboard;
    }

    protected AbstractWifiModule getWifiModule() {
        return wifiModule;
    }
}
