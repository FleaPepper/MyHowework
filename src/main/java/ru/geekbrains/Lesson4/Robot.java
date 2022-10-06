package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.iJump;
import ru.geekbrains.Lesson5.iRun;

public class Robot extends Participant implements iRun, iJump {

    private double runDistance;
    private double jumpHeight;

    public Robot(String name, double jumpHeight, double runDistance) {
        super(name);
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public double getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public double getRunDistance() {
        return runDistance;
    }
}
