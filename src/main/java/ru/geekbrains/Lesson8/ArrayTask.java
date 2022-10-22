package ru.geekbrains.Lesson8;

import java.util.HashMap;
import java.util.Map;

public class ArrayTask {

    public static void main(String[] args) {

        String[] array = new String[] {
                "word",
                "word2",
                "word3",
                "word4",
                "word5",
                "word",
                "word2",
                "word3",
                "word4",
                "word5",
                "word6",
                "word7",
                "word8",
                "word9",
        };

        arrayMethod(array);

    }

    public static void arrayMethod(String[] array) {

        Map<String, Integer> map = new HashMap<>();

        for (String str : array) {
            if (map.containsKey(str))
                map.replace(str, map.get(str) + 1);
            else
                map.put(str, 1);
        }

        map.forEach((key, value) -> System.out.println(key + " " + value));

    }

}
