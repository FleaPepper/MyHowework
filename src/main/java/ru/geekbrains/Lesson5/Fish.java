package ru.geekbrains.Lesson5;

import ru.geekbrains.Lesson4.Participant;

public class Fish extends Participant implements iSwim {

    private double swimDistance;

    public Fish(String name, double swimDistance) {
        super(name);
        this.swimDistance = swimDistance;
    }

    public double getSwimDistance() {
        return swimDistance;
    }
}
