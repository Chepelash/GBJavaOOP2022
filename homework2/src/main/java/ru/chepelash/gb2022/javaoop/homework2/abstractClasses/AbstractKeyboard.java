package ru.chepelash.gb2022.javaoop.homework2.abstractClasses;

public abstract class AbstractKeyboard {
    private final int keyNumber;
    private final String keyboardType;

    public AbstractKeyboard(int keyNumber, String keyboardType) {
        this.keyNumber = keyNumber;
        this.keyboardType = keyboardType;
    }

    public AbstractKeyboard() {
        this(104, "Mechanic");
    }
    public abstract void clickButton();

    public int getKeyNumber() {
        return keyNumber;
    }

    public String getKeyboardType() {
        return keyboardType;
    }
}
