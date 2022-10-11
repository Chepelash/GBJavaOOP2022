package ru.chepelash.gb2022.javaoop.homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class RandomNumberGeneratorTest {
    @Test
    void iterator10() {
        RandomNumberGenerator generator = new RandomNumberGenerator();
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i:
             generator) {
            testList.add(i);
        }
        testList.forEach(System.out::println);
        assertEquals(10, testList.size());
    }

    @Test
    void iteratorMany() {
        RandomNumberGenerator generator = new RandomNumberGenerator(20);
        ArrayList<Integer> testList = new ArrayList<>();
        for (int i:
                generator) {
            testList.add(i);
        }
        testList.forEach(System.out::println);
        assertEquals(20, testList.size());
    }
}