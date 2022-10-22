package ru.geekbrains.Lesson8;

public class Main {

    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Snow", "+7-965-077-72-82");
        phoneBook.add("Cherkesov", "+7-965-077-72-82");
        phoneBook.add("Snow", "+7-918-555-55-55");
        phoneBook.add("Kate", "blabla");

        phoneBook.get("Snow");
        phoneBook.printPhoneBook();

    }

}
