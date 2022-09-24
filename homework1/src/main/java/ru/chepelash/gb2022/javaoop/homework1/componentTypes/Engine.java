package ru.chepelash.gb2022.javaoop.homework1.componentTypes;

public class Engine {
    private Boolean work;
    public Engine(){
        work = false;
    }
    public void start () {
        this.work = true;
        System.out.println("Двигатель запущен");
    }

    public void stop () {
        this.work = false;
        System.out.println("Двигатель остановлен");
    }

    public void throttleUp(int level) {
        if (this.work) {
            System.out.printf("Дросель открыт %d%n", level);
        }
    }

    public Boolean getWork() {
        return work;
    }

}
