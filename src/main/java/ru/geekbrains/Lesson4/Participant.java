package ru.geekbrains.Lesson4;

public class Participant {

    private String name;
    private double jumpHeight;
    private double runDistance;

    public Participant(String name, double jumpHeight, double runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public String getName() {
        return name;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public double getRunDistance() {
        return runDistance;
    }

}
