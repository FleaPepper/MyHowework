package ru.geekbrains.Lesson5;

import ru.geekbrains.Lesson4.Obstacle;
import ru.geekbrains.Lesson4.Participant;

public class Chasm extends Obstacle {


    public Chasm(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant instanceof iFly) {
            iFly iFly = (iFly) participant;
            if (iFly.getFlyDistance() >= getValue()) {
                System.out.printf("%s успешно перелетел пропасть %n", participant.getName());
                return true;
            } else {
                System.out.printf("%s не смог перелететь пропасть %n", participant.getName());
                return false;
            }
        }
        else System.out.printf("%s не умееть летать!%n", participant.getName());
        return false;
    }
}
