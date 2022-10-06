package ru.geekbrains.Lesson4;

public abstract class Obstacle {

    private double value;
    public Obstacle(double value) {
        this.value = value;
    }

    public abstract boolean completeObstacle(Participant participant);

    public double getValue() {
        return value;
    }

}
