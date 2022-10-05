package ru.geekbrains.Lesson1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {2, 1, 5, 4, 4};
        System.out.println(isBalanced(array));

    }

    public static boolean sum (int a, int b) {

        boolean result = (a + b >= 10) && (a + b <= 20);
        return result;

    }

    public static String positiveOrNegative (int a) {

        String result = a >= 0 ? "positive" : "negative";
        return result;

    }

    public static boolean isNegative (int a) {

        boolean result = a < 0;
        return result;

    }

    public static String hello (String name) {

        String msg = "Hello, " + name + "!";
        return msg;

    }

    public static int[] exchange (int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] == 0 ? 1 : 0;
        }
        return array;
    }

    public static int[] fillArray () {

        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = 2 + i*3;
        }
        return array;
    }

    public static int[] changeArray () {

        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] < 6 ? array[i]*2 : array[i];
        }
        return array;
    }

    public static int[][] doubleArray (int size) {

        int[][] array = new int[size][size];
        for (int i =0; i < array.length; i++) {
            array[i][i] = 1;
        }
        return array;
    }

    public static String minAndMax (int[] array) {

        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = array[i] > max ? array[i] : max;
            min = array[i] < min ? array[i] : min;
        }
        String result = "Max = " + max + ", Min = " + min;
        return result;
    }

    public static String isLeapYear (int year) {
        String result = "";
        if ((year % 4 == 0) && ((year % 400 == 0) | (year % 100 != 0))) {
            result = "the year is leap";
        } else result = "the year is not leap";
        return result;
    }

    public static boolean isBalanced (int[] array) {

        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < array.length; i++) {
            leftSum += array[i];
            rightSum = 0;
            for (int j = i + 1; j < array.length; j++ ) {
                rightSum += array[j];
                if (leftSum == rightSum)
                    return true;
            }
        }
        return false;
    }

}
