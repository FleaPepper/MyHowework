package ru.geekbrains.Lesson7;

public class IncorrectFruitException extends Exception {

    public IncorrectFruitException() {
        super("Mixing fruits in boxes is not allowed!");
    }
}
