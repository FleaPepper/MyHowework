package ru.geekbrains.Lesson2;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -1, -20};
        System.out.println(Arrays.toString(mixArray(array)));

    }

    public static void triangle (int size) {

        if (size % 2 == 0) {
            System.out.println("Error: the size is not even!");
            return;
        }
        char[][] triangle = new char[size][size];
        for (int i = 0; i < triangle.length; i++)
            for (int j = 0; j < triangle.length; j++)
                triangle[i][j] = ' ';
        for (int i = 0; i <= triangle.length/2; i++) {
            triangle[i][(triangle.length/2 - i)] = '*';
            triangle[i][triangle.length/2 + i] = '*';
            if (i == triangle.length/2)
                for (int j = 0; j < triangle.length; j++)
                    triangle[i][j] = '*';
        }
        for (int i = 0; i <= triangle.length/2; i++) {
            System.out.println(Arrays.toString(triangle[i]));
        }
    }

    public static int[] sort (int[] array) {

        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
            min = array[i+1];
        }
        return array;
    }

    public static String secondsToTime (int seconds) {

        String hours = Integer.toString(seconds/3600);
        if (hours.length() < 2)
            hours = "0" + hours;
        seconds = seconds%3600;
        String minutes = Integer.toString(seconds/60);
        if (minutes.length() < 2)
            minutes = "0" + minutes;
        String secondss = Integer.toString(seconds%60);
        if (secondss.length() < 2)
            secondss = "0" + secondss;
        return hours + ":" + minutes + ":" + secondss;

    }

    public static int[] reverseArray (int[] array) {

        int buffer = 0;
        for (int i = 0; i < array.length/2; i++) {
            buffer = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = buffer;
        }
        return array;
    }

    public static int[] mixArray (int[] array) {

        Random random = new Random();
        int newIndex = 0;
        int buffer = 0;
        for (int i = 0; i < array.length; i++) {
            newIndex = random.nextInt(array.length);
            buffer = array[i];
            array[i] = array[newIndex];
            array[newIndex] = buffer;
        }
        return array;
    }

}
