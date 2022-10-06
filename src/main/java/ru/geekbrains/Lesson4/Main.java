package ru.geekbrains.Lesson4;

public class Main {

    public static void main(String[] args) {

        Obstacle[] obstacles = new Obstacle[] {
                new Wall(2.5),
                new Treadmill(3),
                new Wall(4),
                new Treadmill(5),
                new Wall(5)
        };
        Participant[] participants = new Participant[] {
                new Robot("R2D2", 3, 5),
                new Cat("Bobby", 5, 10),
                new Human("Arthur", 5, 2.5)
        };
        for (Participant parts : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.completeObstacle(parts))
                    break;
            }
        }

    }

}
