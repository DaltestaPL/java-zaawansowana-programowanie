package org.sda.lambda;

import java.util.ArrayList;
import java.util.List;

public class PredicateMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tomek Wojtyra");
        names.add("Julia Wojtyra");
        names.add("Paweł Wojtyra");
        names.add("Tomek Kowalski");
        System.out.println("imiona" + names);

        var filtered = filter(names, new Predicate() {
            @Override
            public boolean apply(String n) {
                return n.contains("Tomek");
            }
        });
        System.out.println("Przefiltrowana: " + filtered);

        var filter2 = filter(names, n -> n.startsWith("J"));
    }

    private static List<String> filter(List<String> list, Predicate predicate) {
        List<String> result = new ArrayList<>();
        for (String name : list) {
            if (predicate.apply(name)) {
                result.add(name);
            }
        }
        return result;
    }
}
