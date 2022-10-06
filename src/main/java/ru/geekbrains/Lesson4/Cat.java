package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.iJump;
import ru.geekbrains.Lesson5.iRun;

public class Cat extends Participant implements iRun, iJump {

    private double runDistance;
    private double jumpHeight;

    public Cat(String name, double jumpHeight, double runDistance) {
        super(name);
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public double getRunDistance() {
        return runDistance;
    }

    public void setRunDistance(double runDistance) {
        this.runDistance = runDistance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public void setJumpHeight(double jumpHeight) {
        this.jumpHeight = jumpHeight;
    }
}
