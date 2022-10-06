package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.iJump;
import ru.geekbrains.Lesson5.iRun;
import ru.geekbrains.Lesson5.iSwim;

public class Human extends Participant implements iJump, iRun, iSwim {

    private double jumpHeight;
    private double runDistance;
    private double swimDistance;

    public Human(String name, double jumpHeight, double runDistance, double swimDistance) {
        super(name);
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
        this.swimDistance = swimDistance;
    }

    @Override
    public double getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public double getRunDistance() {
        return runDistance;
    }

    @Override
    public double getSwimDistance() {
        return swimDistance;
    }
}
