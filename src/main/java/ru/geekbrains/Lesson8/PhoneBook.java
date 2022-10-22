package ru.geekbrains.Lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, ArrayList<String>> phoneBook = new HashMap<>();

    public void add(String surname, String number) {

        if (phoneBook.containsKey(surname)) {
            phoneBook.get(surname).add(number);
        }
        else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(number);
            phoneBook.put(surname, numbers);
        }
    }

    public void printPhoneBook() {

        phoneBook.forEach((key, value) -> {
            System.out.print(key + " ");
            value.forEach((number) -> System.out.print(number + " "));
            System.out.println("");
        });
    }

    public void get(String surname) {

        if (!phoneBook.containsKey(surname)) {
            System.out.println("There is no such a person in phonebook");
            return;
        }

        System.out.print(surname + " ");
        phoneBook.get(surname).forEach((number) -> System.out.print(number + " "));
        System.out.println("");
    }

}
