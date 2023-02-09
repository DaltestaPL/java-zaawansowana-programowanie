package org.sda.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ZooMain {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();
        animals.add("żaba");
        animals.add("kot");
        animals.add("krowa");
        System.out.println("Zwierzęta: " + animals);
        System.out.println("Powitanie: " +
                sayHi(animals, new Zoo() {
            @Override
            public String apply(String s) {
                return "Siema " + s + "!";
            }
        }));
        System.out.println(sayHi(animals, s -> "Cześć " + s));
        System.out.println(sayHi(animals, animal -> "Do widzenia " + animal));

        var result = animals.stream()
                .filter(s -> s.equals("kot"))
                .collect(Collectors.toList());

        System.out.println(result);
    }
    private static List<String> sayHi(List<String> animals, Zoo zoo) {
        var result = new ArrayList<String>();
        for (String animal : animals) {
            result.add(zoo.apply(animal));
        }
        return result;
    }
}
