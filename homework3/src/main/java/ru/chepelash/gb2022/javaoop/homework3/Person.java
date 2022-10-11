package ru.chepelash.gb2022.javaoop.homework3;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;
    private double weight;
    private double height;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Double.compare(person.weight, weight) == 0 && Double.compare(person.height, height) == 0 && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, weight, height);
    }

    public Person(String name, int age, double weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public int compareTo(Person o) {
        int compareResult;
        // by name
        if((compareResult = name.compareTo(o.getName())) == 0){
            // by age from young to old
            if((compareResult = age - o.getAge()) == 0){
                // by height from tall to short
                if((compareResult = (int) (o.getHeight() - height)) == 0){
                    // by weight from skinny to fat
                    return (int) (weight - o.getWeight());
                }
            }
        }
        return compareResult;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
