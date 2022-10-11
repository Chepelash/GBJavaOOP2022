package ru.chepelash.gb2022.javaoop.homework4;

import java.util.ArrayList;

public class Box <T extends Fruit>{
    private ArrayList<T> fruits;

    public Box(){
        fruits = new ArrayList<>();
    }
    public void putFruits(ArrayList<T> externalFruits){
        if(externalFruits == null || externalFruits.isEmpty()){
            throw new IllegalArgumentException();
        }
        fruits.addAll(externalFruits);
    }
    public void swapBoxes(Box<T> otherBox){
        if(otherBox.fruits.isEmpty()){
            return;
        }
        ArrayList<T> tempList = new ArrayList<>(otherBox.fruits);
        otherBox.fruits.clear();
        if(!fruits.isEmpty()) {
            otherBox.putFruits(fruits);
            fruits.clear();
        }
        putFruits(tempList);
    }
    public double getWeight(){
        if(fruits.isEmpty()){
            return 0;
        }
        return fruits.size() * fruits.get(0).getWeight();
    }
    public boolean compare(Box<? extends Fruit> otherBox){
        return getWeight() == otherBox.getWeight();
    }
    public void putInOtherBox(Box<T> otherBox){
        if(fruits.isEmpty())
            return;
        otherBox.putFruits(fruits);
        fruits.clear();
    }
}
