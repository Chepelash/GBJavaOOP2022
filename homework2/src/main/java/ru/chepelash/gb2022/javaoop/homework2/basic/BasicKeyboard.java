package ru.chepelash.gb2022.javaoop.homework2.basic;

import ru.chepelash.gb2022.javaoop.homework2.abstractClasses.AbstractKeyboard;

public class BasicKeyboard extends AbstractKeyboard {
    public BasicKeyboard(int keyNumber, String keyboardType) {
        super(keyNumber, keyboardType);
    }

    public BasicKeyboard() {
        super();
    }

    @Override
    public void clickButton() {
        System.out.println("Click");
    }

    @Override
    public int getKeyNumber() {
        return super.getKeyNumber();
    }

    @Override
    public String getKeyboardType() {
        return super.getKeyboardType();
    }
}
