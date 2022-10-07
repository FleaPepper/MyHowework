package ru.geekbrains.Lesson6;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {

        String[][] array = new String[4][4];

        for (String[] strings : array) {
            Arrays.fill(strings, "1");
        }

        array[2][2] = "!";

        System.out.println("Сумма элементов = " + arrayMethod(array));

    }

    public static int arrayMethod(String[][] array) throws MyArraySizeException, MyArrayDataException {

        int result = 0;

        if (array.length == 4) {
            for (String[] strings : array) {
                if (strings.length != 4)
                    throw new MyArraySizeException("Некорректный размер массива");
            }
        } else
            throw new MyArraySizeException("Некорректный размер массива");

        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++) {
                try {
                    result += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Неверный символ в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return result;
    }

}
