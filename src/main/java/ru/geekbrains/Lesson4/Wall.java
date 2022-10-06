package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.iJump;

public class Wall extends Obstacle {

    public Wall(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant instanceof iJump) {
            iJump iJump = (iJump) participant;
            if (iJump.getJumpHeight() >= getValue()) {
                System.out.printf("%s успешно перепрыгнул стену %n", participant.getName());
                return true;
            } else {
                System.out.printf("%s не смог перепрыгнуть стену %n", participant.getName());
                return false;
            }
        }
        else System.out.printf("%s не умееть прыгать!%n", participant.getName());
        return false;
    }

}
