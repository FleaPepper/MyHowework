package ru.geekbrains.Lesson4;

public class Wall extends Obstacle {

    public Wall(double value) {
        super(value);
    }

    @Override
    public boolean completeObstacle(Participant participant) {
        if (participant.getJumpHeight() >= getValue()) {
            System.out.println(participant.getName() + " успешно преодолел стену");
            return true;
        } else {
            System.out.println(participant.getName() + " не смог преодолеть стену");
            return false;
        }
    }

}
