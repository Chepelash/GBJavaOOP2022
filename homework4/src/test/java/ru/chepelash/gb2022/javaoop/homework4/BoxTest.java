package ru.chepelash.gb2022.javaoop.homework4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {
    private Box<Orange> orangeBox = new Box<>();
    private Orange orange = new Orange();
    private Box<Apple> appleBox;
    private Box<Apple> otherAppleBox;
    private Apple apple = new Apple();
    @BeforeEach
    void setUp() {
        appleBox = new Box<>();
    }

    @Test
    void putFruits() {
        assertEquals(0, appleBox.getWeight());
        ArrayList<Apple> appleList = new ArrayList<>(List.of(
                new Apple(),
                new Apple(),
                new Apple()
        ));
        appleBox.putFruits(appleList);
        assertEquals(apple.getWeight() * 3, appleBox.getWeight());
    }

    @Test
    void swapBoxes() {
        ArrayList<Apple> appleList = new ArrayList<>(List.of(
                new Apple(),
                new Apple(),
                new Apple()
        ));
        ArrayList<Apple> otherAppleList = new ArrayList<>(List.of(
                new Apple(),
                new Apple()
        ));
        Box<Apple> expectedBox = new Box<>();
        expectedBox.putFruits(appleList);
        Box<Apple> otherExpectedBox = new Box<>();
        otherExpectedBox.putFruits(otherAppleList);

        otherAppleBox = new Box<>();
        otherAppleBox.putFruits(otherAppleList);
        appleBox.putFruits(appleList);

        assertEquals(expectedBox.getWeight(), appleBox.getWeight());
        assertEquals(otherExpectedBox.getWeight(), otherExpectedBox.getWeight());

        appleBox.swapBoxes(otherAppleBox);

        assertEquals(expectedBox.getWeight(), otherAppleBox.getWeight());
        assertEquals(otherExpectedBox.getWeight(), appleBox.getWeight());

    }

    @Test
    void compare() {
        ArrayList<Orange> oranges = new ArrayList<>(List.of(
                new Orange(),
                new Orange(),
                new Orange()
        ));
        orangeBox.putFruits(oranges);
        ArrayList<Apple> apples = new ArrayList<>(List.of(
                new Apple(),
                new Apple(),
                new Apple()
        ));
        appleBox.putFruits(apples);
        assertFalse(appleBox.compare(orangeBox));

        orangeBox = new Box<>();
        oranges.remove(0);
        orangeBox.putFruits(oranges);
        assertTrue(appleBox.compare(orangeBox));
    }

    @Test
    void putInOtherBox() {
        ArrayList<Apple> apples = new ArrayList<>(List.of(
                new Apple(),
                new Apple(),
                new Apple()
        ));
        appleBox.putFruits(apples);
        Box<Apple> otherAppleBox = new Box<>();
        otherAppleBox.putFruits(apples);
        appleBox.putInOtherBox(otherAppleBox);
        assertEquals(0, appleBox.getWeight());
        assertEquals(apple.getWeight() * 6, otherAppleBox.getWeight());
    }
}