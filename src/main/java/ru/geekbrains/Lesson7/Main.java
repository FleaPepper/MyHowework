package ru.geekbrains.Lesson7;

public class Main {

    public static void main(String[] args) throws IncorrectFruitException {

        Box box1 = new Box();
        Box box2 = new Box();
        Box box3 = new Box();

        box1.add(new Orange());
        box1.add(new Orange());

        box2.add(new Apple());
        box2.add(new Apple());
        box2.add(new Apple());

        System.out.println("box1 weight equality compared to box2 is " + box1.compare(box2));

        box1.popAllIntoAnother(box3);

        System.out.println(box1.getWeight());
        System.out.println("box2 weight equality compared to box3 is " + box2.compare(box3));

    }

}
