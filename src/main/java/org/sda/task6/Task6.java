package org.sda.task6;

import java.util.TreeMap;

/**
 * Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
 */
public class Task6 {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Java");
        treeMap.put(10, "Python");
        treeMap.put(5, "C#");

        handleTreeMap(treeMap);
    }

    public static void handleTreeMap(TreeMap<Integer, String> treeMap) {
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.lastEntry());
    }
}
