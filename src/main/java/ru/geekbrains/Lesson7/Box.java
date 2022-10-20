package ru.geekbrains.Lesson7;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private List<Fruit> box = new ArrayList<>();

    public boolean compare(Box<?> box2) {
        return getWeight() == box2.getWeight();
    }

    public void add(Fruit fruit) throws IncorrectFruitException {
        if (!box.isEmpty()) {
            if (box.get(0) instanceof Orange && fruit instanceof Apple)
                throw new IncorrectFruitException();
            if (box.get(0) instanceof Apple && fruit instanceof Orange)
                throw new IncorrectFruitException();
        }
        box.add(fruit);
        System.out.printf("%s added into the box %n", fruit.getName());
    }

    public float getWeight() {
        if (box.isEmpty()) {
            return 0f;
        }
        return box.size() * box.get(0).getWeight();
    }

    public void popAllIntoAnother(Box<T> box2) throws IncorrectFruitException {
        if (box.isEmpty()) {
            System.out.println("Your box is empty, there is nothing to move!");
            return;
        }
        if (!box2.box.isEmpty()) {
            if (box.get(0) instanceof Orange && box2.box.get(0) instanceof Apple)
                throw new IncorrectFruitException();
            if (box.get(0) instanceof Apple && box2.box.get(0) instanceof Orange)
                throw new IncorrectFruitException();
        }
        box2.box.addAll(box);
        box.clear();
        System.out.println("Successfully popped all fruit from one box into another!");
    }

}
