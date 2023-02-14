package org.sda.task10;


import org.sda.task9.Point2D;

/**
 * ZADANIE 10.
 * Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery,
 * settery i konstruktor. Stwórz interfejs Movable
 * posiadający metodę move(MoveDirection moveDirection).
 * Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
 * Przy wywołaniu metody move(MoveDirection moveDirection),
 * obiekty mają zmienić swoje położenie na podstawie przekazanego kierunku (MoveDirection).
 * Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
 */
public class Task10 {
    public static void main(String[] args) {
        var point = new Point2D(2.0,2.0);
        var direction = new MoveDirection(2.0, 2.0);
        System.out.println("Przed przesunięciem: " + point);
        point.move(direction);
        System.out.println("Po przesunięciu: " + point);
    }
}
