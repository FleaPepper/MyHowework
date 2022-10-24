package ru.geekbrains.Lesson9;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

public class Main {

    private static final Path DIRECTORY = Path.of("C:/Users/artur/Desktop/test");

    public static void main(String[] args) throws IOException {

        correctDeleteALl(DIRECTORY);

    }

    public static int subStringCount(File file, String subString) throws IOException {

        BufferedReader reader = Files.newBufferedReader(file.toPath());

        if (!reader.ready()) {
            System.out.println("File is empty");
            return -1;
        }

        StringBuilder sb = new StringBuilder();
        int nextChar;
        int count = 0;

        while ((nextChar = reader.read()) != -1) {
            if (sb.length() < subString.length()) {
                sb.append((char) nextChar);
                continue;
            } else if (sb.toString().equals(subString)) {
                count++;
            }
            sb.deleteCharAt(0);
            sb.append((char) nextChar);
        }
        if (sb.toString().equals(subString))
            count++;
        reader.close();
        return count;
    }

    public static void mergeIntoOne(String path) throws IOException {

        if (!Files.isDirectory(Path.of(path))) {
            System.out.println("Not a directory!");
            return;
        }

        DirectoryStream<Path> stream = Files.newDirectoryStream(DIRECTORY);
        BufferedReader reader = null;
        PrintWriter writer = new PrintWriter(
                new BufferedWriter(
                        new FileWriter("output.txt")
                )
        );

        File file;

        for (Path entry : stream) {
            file = new File(entry.toUri());
            if (file.isFile()) {
                reader = new BufferedReader(new FileReader(file.getPath()));
                while (reader.ready()) {
                    writer.write(reader.readLine() + "\n");
                }
            }
        }
        reader.close();
        writer.close();
    }

    public static void joinTextFiles(Path directory, Path fileToJoin) throws IOException {

        Files.createFile(fileToJoin);
        BufferedWriter writer = Files.newBufferedWriter(fileToJoin, StandardCharsets.UTF_8);

        for (File file : Objects.requireNonNull(directory.toFile().listFiles())) {
            if (!file.isDirectory())
                Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8).transferTo(writer);
        }
        writer.close();
    }

    public static void deleteAll(String path) throws IOException {

        if (!Files.isDirectory(Path.of(path))) {
            System.out.println("Not a directory!");
            return;
        }

        DirectoryStream<Path> stream = Files.newDirectoryStream(DIRECTORY);
        File file;

        for (Path entry : stream) {
            file = new File(entry.toUri());
            if (file.isFile())
                file.delete();
            if (file.isDirectory()) {
                DirectoryStream<Path> internalStream = Files.newDirectoryStream(file.toPath());
                String deleteDirPath = file.getPath();
                for (Path internalFile : internalStream) {
                    file = new File(internalFile.toUri());
                    file.delete();
                }
                file = new File(deleteDirPath);
                file.delete();
            }

        }
    }

    public static void correctDeleteALl(Path directory) {

        for (File file : directory.toFile().listFiles()) {
            file.delete();
            if (file.isDirectory()) {
                correctDeleteALl(file.toPath());
                file.delete();
            }
        }

    }

}
