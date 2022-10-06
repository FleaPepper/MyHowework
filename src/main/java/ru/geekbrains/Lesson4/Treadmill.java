package ru.geekbrains.Lesson4;

public class Treadmill extends Obstacle {

    public Treadmill(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant.getRunDistance() >= getValue()) {
            System.out.println(participant.getName() + " успешно пробежал дорожку");
            return true;
        } else {
            System.out.println(participant.getName() + " не смог пробежать дорожку");
            return false;
        }
    }

}
