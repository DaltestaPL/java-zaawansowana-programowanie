package org.sda.task23;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Stwórz klasę Zoo, która będzie posiadała zbiór zwierząt oraz pozwalała na otrzymywanie statystyk
 * na temat posiadanych zwierząt:
 * int getNumberOfAllAnimals() → zwraca liczbę wszystkich zwierząt
 * Map<String, Integer> getAnimalsCount() → zwraca liczbę zwierząt każdego gatunku
 * Map<String, Integer> getAnimalsCountSorted() → zwraca liczbę zwierząt każdego gatunku posortowaną
 * na podstawie ilości zwierząt danego gatunku, gdzie pierwszym elementem
 * zawsze jest gatunek z największą ilością zwierząt
 * void addAnimals(String, int) → dodaje n zwierząt danego gatunku
 */
public class Zoo {

    private final Map<String, Integer> animals;

    public Zoo() {
        this.animals = new HashMap<>();
    }

    public Zoo(Map<String, Integer> animals) {
        this.animals = animals;
    }

    public int getNumberOfAllAnimals() {
        int result = 0;
        for (Map.Entry<String, Integer> pair : animals.entrySet()) {
            result += pair.getValue();
        }
        return result;
    }

    public Map<String, Integer> getAnimalsCount() {
        return this.animals;
    }

    public Map<String, Integer> getAnimalsCountSorted() {
        return this.animals.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void addAnimals(String animal, int numberOfAnimals) {
        this.animals.put(animal, numberOfAnimals);
    }
}
