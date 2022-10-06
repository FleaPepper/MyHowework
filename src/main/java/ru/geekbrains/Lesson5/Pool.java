package ru.geekbrains.Lesson5;

import ru.geekbrains.Lesson4.Obstacle;
import ru.geekbrains.Lesson4.Participant;

public class Pool extends Obstacle {


    public Pool(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant instanceof iSwim) {
            iSwim iSwim = (iSwim) participant;
            if (iSwim.getSwimDistance() >= getValue()) {
                System.out.printf("%s успешно проплыл бассейн %n", participant.getName());
                return true;
            } else {
                System.out.printf("%s не смог проплыть бассейн %n", participant.getName());
                return false;
            }
        }
        else System.out.printf("%s не умееть плавать!%n", participant.getName());
        return false;
    }

}
