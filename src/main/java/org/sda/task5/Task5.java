package org.sda.task5;

import java.util.HashMap;
import java.util.HashSet;

/**
 * ZADANIE 5.
 * Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet.
 * W tym celu zaimplementuj obsługę metod:
 * • add
 * • remove
 * • size
 * • contains
 * • clear
 */
public class Task5 {

    public static void main(String[] args) {
        SDAHashSet<String> sdaHashSet = new SDAHashSet<>();
        sdaHashSet.add("Tomek");
    }
}
