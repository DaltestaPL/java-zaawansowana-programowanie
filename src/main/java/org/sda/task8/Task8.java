package org.sda.task8;

/**
 * ZADANIE 8.
 * Zaimplementuj interfejs Validator,
 * który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
 * Stwórz klasę Parcel z parametrami:
 * • int xLength
 * • int yLength
 * • int zLength
 * • float weight
 * • boolean isExpress
 * Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300,
 * czy każdy z rozmiarów nie jest mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false
 * lub 15.0 dla isExpress=true. W przypadku błędów, powinien o nich poinformować użytkownika.
 */
public class Task8 {
    public static void main(String[] args) {
        //Paczka do nadania:
        Parcel paczka = new Parcel(10,20,10,20,false);
        //Dodajemy walidator
        Validator validator = new ValidatorImpl();
        //sprawdzamy paczkę
        boolean isParcelValid = validator.validate(paczka);
        //informujemy o wyniku
        if (isParcelValid) {
            System.out.println("Paczka jest ok");
        } else {
            System.out.println("Paczka nie jest możliwa do nadania");
        }
    }
}
