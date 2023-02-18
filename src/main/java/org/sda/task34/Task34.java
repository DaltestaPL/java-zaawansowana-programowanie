package org.sda.task34;

/**
 * Utwórz klasę rozszerzającą klasę Thread np. MyThread, przeciąż metodę run(),
 * w której wyświetlisz w konsoli nazwę wątku odczytując ją ze statycznej metody aktualnego wątku:
 *
 * Thread.currentThread().getName()
 *
 * Utwórz klasę z metodą public static void main(String[] args).
 * Wewnątrz metody main utwórz zmienną typu naszej klasy stworzonej powyżej np. MyThread
 * oraz zainicjuj klasę.
 * Na zmiennej wykonać metodę start().
 */
public class Task34 {

    public static void main(String[] args) {
        Thread thread0 = new MyThread();
        thread0.start();
        Thread thread1 = new MyThread();
        thread1.start();
    }
}
