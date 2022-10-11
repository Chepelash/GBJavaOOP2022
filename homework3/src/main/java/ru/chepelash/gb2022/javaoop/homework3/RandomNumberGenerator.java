package ru.chepelash.gb2022.javaoop.homework3;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class RandomNumberGenerator implements Iterable<Integer>{
    private final int amount;
    private int counter;
    private final Random random;

    public RandomNumberGenerator(int amount){
        random = new Random();
        counter = 0;
        this.amount = amount;
    }
    public RandomNumberGenerator(){
        this(10);
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return counter < amount;
            }

            @Override
            public Integer next() {
                if(hasNext()){
                    counter++;
                    return random.nextInt();
                }
                throw new NoSuchElementException();
            }
        };
    }

}
