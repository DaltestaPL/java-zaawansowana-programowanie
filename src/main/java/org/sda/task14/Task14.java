package org.sda.task14;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * ZADANIE 14.
 * Na podstawie 100000 elementowej tablicy z losowo wybranymi wartościami
 * zaimplementuj następujące funkcjonalności:
 *
 * zwróć listę unikalnych elementów,
 * zwróć listę elementów, które co najmniej raz powtórzyły się w wygenerowanej tablicy,
 * zwróć listę 25 najczęściej powtarzających się elementów.
 * Zaimplementuj metodę, która deduplikuje elementy w liście.
 * W przypadku znalezienia duplikatu, zastępuje go nową losową wcześniej nie występującą wartością.
 * Sprawdź czy metoda zadziałała poprawnie wywołując metodę numer 2.
 */
public class Task14 {

    public static void main(String[] args) {
//        int testedCapacity = 100;
        Integer[] randomInts = prepareRandomArray(100);
        Integer[] unique = findUniqueValues(randomInts);
    }

    private static Integer[] findUniqueValues(Integer[] randomInts) {
        List<Integer> uniqueValuesList = new ArrayList<>();
        for (Integer anInt : randomInts) {
            int counter = 0;
            for (Integer randomInt : randomInts) {
                if (anInt.equals(randomInt)) {
                    counter++;
                }
            }
            if (counter == 1) {
                uniqueValuesList.add(anInt);
            }
        }
        return mapToArray(uniqueValuesList);
    }

    private static Integer[] mapToArray(List<Integer> list) {
        Integer[] array = new Integer[list.size()];
        for (int i = 0; i < list.size(); i++) {
            array[i] = list.get(i);
        }
        return array;
    }

    private static Integer[] prepareRandomArray(int numberOfElements) {
        Integer[] randomInts = new Integer[100];
        Random random = new Random();
        for (int i = 0; i < numberOfElements; i++) {
            randomInts[i] = (random.nextInt(numberOfElements/10));
        }
        return randomInts;
    }
}
