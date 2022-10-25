package ru.geekbrains.Lesson11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestRepository {

    public static void main(String[] args) {

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" +
                "geekbrains_study?createDatabaseIfNotExist=true&allowPublicKeyRetrieval=true&useSSL=false&useUnicode=true&characterEncoding=UTF-8&serverTimezone=UTC",
                "root", "root")) {

            Repository<User> userRepository = new Repository<>(User.class, connection);

            User user1 = new User();
            user1.setUsername("CatHudson");
            user1.setPassword("blabla");

            User user2 = new User();
            user2.setUsername("root");
            user2.setPassword("root");

            userRepository.insert(user1);
            userRepository.insert(user2);

            user1 = userRepository.findById(1L);
            System.out.println(user1.getUsername());
            user1.setUsername("Another_user");
            userRepository.update(user1);
            user1 = userRepository.findById(1L);
            System.out.println(user1.getUsername());

            userRepository.delete(1L);
            user1 = userRepository.findById(1L);
            if (user1 == null)
                System.out.println("OK");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
