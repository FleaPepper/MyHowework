package ru.geekbrains.Lesson5;

import ru.geekbrains.Lesson4.Participant;

public class Bird extends Participant implements iFly {

    private double flyDistance;

    public Bird(String name, double flyDistance) {
        super(name);
        this.flyDistance = flyDistance;
    }

    @Override
    public double getFlyDistance() {
        return flyDistance;
    }
}
