package ru.geekbrains.Lesson4;

import ru.geekbrains.Lesson5.Bird;
import ru.geekbrains.Lesson5.Chasm;
import ru.geekbrains.Lesson5.Fish;
import ru.geekbrains.Lesson5.Pool;

public class Main {

    public static void main(String[] args) {

        Obstacle[] obstacles = new Obstacle[] {
                new Wall(2.5),
                new Treadmill(3),
                new Wall(4),
                new Treadmill(5),
                new Wall(5),
                new Pool(10),
                new Chasm(50)
        };
        Participant[] participants = new Participant[] {
                new Robot("R2D2", 3, 5),
                new Cat("Bobby", 5, 10),
                new Human("Arthur", 3, 5, 9),
                new Fish("Claus", 15),
                new Bird("Poppy", 100.5)
        };
        for (Participant parts : participants) {
            for (Obstacle obs : obstacles) {
                if (!obs.completeObstacle(parts))
                    break;
            }
        }

    }

}
