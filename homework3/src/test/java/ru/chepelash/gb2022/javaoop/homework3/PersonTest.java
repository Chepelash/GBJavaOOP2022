package ru.chepelash.gb2022.javaoop.homework3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    private ArrayList<Person> persons;
    @BeforeEach
    void setUp() {
        persons = new ArrayList<>(List.of(
                new Person("Aaron", 22, 34., 160.),
                new Person("Abron", 22, 34., 160.),
                new Person("Aaron", 19, 34., 160.),
                new Person("Aaron", 22, 34., 180.),
                new Person("Aaron", 22, 24., 160.)
        ));
    }

    @Test
    void compareTo() {
        persons.stream().sorted().forEach(System.out::println);
        ArrayList<Person> expected = new ArrayList<>(List.of(
                new Person("Aaron",19,34.0,160.0),
                new Person("Aaron", 22, 34.0, 180.0),
                new Person("Aaron",22,24.0,160.0),
                new Person("Aaron", 22, 34.0, 160.0),
                new Person("Abron",22,34.0,160.0)
        ));
        assertArrayEquals(expected.toArray(), persons.stream().sorted().toArray());
    }
}