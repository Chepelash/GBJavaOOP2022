package ru.chepelash.gb2022.javaoop.homework2.abstractClasses;

import ru.chepelash.gb2022.javaoop.homework2.enums.WifiBandWidth;

import static ru.chepelash.gb2022.javaoop.homework2.enums.WifiBandWidth.*;

public abstract class AbstractWifiModule {
    private WifiBandWidth bandWidth;
    private final int topSpeed;
    private String networkName;
    private boolean isConnected;

    public AbstractWifiModule(WifiBandWidth bandWidth, int topSpeed) {
        this.bandWidth = bandWidth;
        this.topSpeed = topSpeed;
    }
    public AbstractWifiModule(){
        this(BAND_2_4GHz, 100000);
    }

    public abstract void connectToNetwork(String networkName);
    public abstract void disconnect();

    public WifiBandWidth getBandWidth() {
        return bandWidth;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public String getNetworkName() {
        return networkName;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void setNetworkName(String networkName) {
        this.networkName = networkName;
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }
}
