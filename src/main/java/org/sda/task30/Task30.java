package org.sda.task30;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Napisz program, który odczyta dowolny plik i zapisze go w tym samym folderze.
 * Zawartość jak i tytuł nowego pliku powinny być odwrócone (od tyłu).
 */
public class Task30 {

    public static void main(String[] args) {
        String filename = "zadanie30";
        String reversedFilename = reverseString(filename);

        List<String> lines = read(filename);
        System.out.println("Linie z pliku" + lines);
        System.out.println("Linie z pliku odwrócone" + reverse(lines));
        write(lines, reversedFilename);
    }

    private static List<String> reverse(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (String line : lines) {
            result.add(reverseString(line));
        }
        Collections.reverse(result);
        return result;
    }

    private static String reverseString(String text) {
        StringBuilder sb = new StringBuilder();
        return sb.append(text).reverse().toString();
    }

    private static List<String> read(String filename) {
        List<String> result;
        try (BufferedReader bufferedReader =
                    new BufferedReader(new FileReader("src/main/resources/" + filename))) {
            result = bufferedReader.lines().collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static void write(List<String> lines, String filename) {
        try(BufferedWriter bufferedWriter =
                    new BufferedWriter(new FileWriter("src/main/resources/" + filename))) {
            //TODO Napisać to tak, żeby wpiswał linię pod sobą a nie w jednej linii
            for (String line : lines) {
                bufferedWriter.write(line);
            }
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
