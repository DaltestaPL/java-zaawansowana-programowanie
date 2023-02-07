package org.sda.task2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Stwórz metodę, która jako parametr przyjmuje listę stringów,
 * następnie zwraca tą listę posortowaną alfabetycznie od Z do A nie biorąc pod uwagę wielkości liter.
 */
public class Task2 {

    public static void main(String[] args) {
        var input =  List.of("Tomek", "arek", "Arek", "Judyta", "Zbigniew");
        List<String> list = new ArrayList<>(input);
        System.out.println("Lista wejsciowa: " + list);
        sortDescCaseInsensitive(list);
        System.out.println("Lista posortowana: " + list);
    }

    private static List<String> sortDescCaseInsensitive(List<String> list) {
        list.sort((o1, o2) -> o2.toLowerCase().compareTo(o1.toLowerCase()));
        return list;
    }
}
