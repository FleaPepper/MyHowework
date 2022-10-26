package ru.geekbrains.Lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        String[] array = {"Box", "House", "Apple", "4444"};
        fifthTask(array);

    }

    private static void firstTask(String string) {

        String collect = Stream.of(string)
                .flatMap(word -> Arrays.stream(word.split(" ")))
                .filter(word -> word.length() > 5)
                .collect(Collectors.joining(" "));

        System.out.println(collect);
    }

    private static void secondTask(String[][] bigArray) {

        List<String> list = new ArrayList<>();
        for (String[] array : bigArray) {
            list.add(Arrays.stream(array)
                    .distinct()
                    .collect(Collectors.joining("\n")));
        }
        System.out.println(list);
    }

    private static void thirdTask() {

        int result = IntStream.iterate(100, number -> number <= 200, number -> number += 1)
                .filter(number -> number % 2 == 0).sum();
        System.out.println(result);
    }

    private static void fourthTask(String[] array) {

        int count = Arrays.stream(array).mapToInt(String::length).sum();
        System.out.println(count);
    }

    private static void fifthTask(String[] array) {

        List<String> strings = Arrays.stream(array)
                .sorted()
                .limit(3)
                .toList();
        System.out.println(strings);
    }

}
