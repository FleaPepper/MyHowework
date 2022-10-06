package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.iRun;

public class Treadmill extends Obstacle {

    public Treadmill(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant instanceof iRun) {
            iRun iRun = (iRun) participant;
            if (iRun.getRunDistance() >= getValue()) {
                System.out.printf("%s успешно пробежал дорожку %n", participant.getName());
                return true;
            } else {
                System.out.printf("%s не смог пробежать дорожку %n", participant.getName());
                return false;
            }
        }
        else System.out.printf("%s не умееть бегать!%n", participant.getName());
        return false;
    }

}

