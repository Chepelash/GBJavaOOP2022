package ru.chepelash.gb2022.javaoop.homework2.abstractClasses;

public abstract class AbstractCdRom {
    private final boolean isCanWrite;
    private final boolean isWorkingWithDvd;
    private final boolean isWorkingWithBlueray;
    private boolean isDiskInserted;
    private String diskName;

    AbstractCdRom(){
        isDiskInserted = false;
        isCanWrite = false;
        isWorkingWithBlueray = false;
        isWorkingWithDvd = false;
    }

    public void setDiskInserted(boolean diskInserted) {
        isDiskInserted = diskInserted;
    }

    public AbstractCdRom(boolean isCanWrite, boolean isWorkingWithDvd, boolean isWorkingWithBlueray) {
        this.isCanWrite = isCanWrite;
        this.isWorkingWithDvd = isWorkingWithDvd;
        this.isWorkingWithBlueray = isWorkingWithBlueray;
        isDiskInserted = false;
    }

    public abstract String readData(int dataLength);
    public abstract void writeData(String data);
    public abstract void insertDisk(String diskName, String diskType);
    public abstract void ejectDisk();
    public boolean isDiskInserted(){
        return isDiskInserted;
    }

    public boolean isCanWrite() {
        return isCanWrite;
    }

    public boolean isWorkingWithDvd() {
        return isWorkingWithDvd;
    }

    public boolean isWorkingWithBlueray() {
        return isWorkingWithBlueray;
    }

    public String getDiskName() {
        return diskName;
    }

    public void setDiskName(String diskName) {
        this.diskName = diskName;
    }
}
