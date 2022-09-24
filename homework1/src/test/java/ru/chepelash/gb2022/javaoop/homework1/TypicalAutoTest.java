package ru.chepelash.gb2022.javaoop.homework1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.chepelash.gb2022.javaoop.homework1.componentTypes.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TypicalAutoTest {
    TypicalAuto auto;
    @BeforeEach
    void setUp() {
        List<Door> doors = new ArrayList<>(List.of(
                new Door(new Window()),
                new Door(new Window()),
                new Door(new Window()),
                new Door(new Window())
        ));
        List<Wheel> wheels = new ArrayList<>(List.of(
                new Wheel(),
                new Wheel(),
                new Wheel(),
                new Wheel()
        ));
        Engine engine = new Engine();
        SteeringWheel steeringWheel = new SteeringWheel();
        Transmission transmission = new Transmission(5);
        Headlight headlight = new Headlight("Yellow");

        auto = new TypicalAuto(doors, wheels, engine, steeringWheel, transmission, headlight);
    }
    @Test
    void testDrive(){
        assertFalse(auto.isDriving());
        assertFalse(auto.isEngineStarted());
        assertFalse(auto.getHeadlight().isOn());
    }
}