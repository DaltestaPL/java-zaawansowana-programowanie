package org.sda.task13;

import org.sda.task12.Car;
import org.sda.task12.EngineType;
import org.sda.task12.Manufacturer;

import java.util.ArrayList;
import java.util.List;

/**
 * ZADANIE 13.
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
 * <p>
 * dodawanie aut do listy,
 * usuwanie auta z listy,
 * zwracanie listy wszystkich aut,
 * zwracanie aut z silnikiem V12,
 * zwracanie aut wyprodukowanych przed rokiem 1999,
 * zwracanie najdroższego auta,
 * zwracanie najtańszego auta,
 * zwracanie auta z co najmniej 3 producentami,
 * zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
 */
public class Task13 {

    public static void main(String[] args) {
        Manufacturer manufacturer1 = new Manufacturer("Firma Jakaś", 1990, "Polska");
        Manufacturer manufacturer2 = new Manufacturer("Compania", 1930, "Włochy");
        Manufacturer manufacturer4 = new Manufacturer("Compania", 1930, "Włochy");
        Manufacturer manufacturer3 = new Manufacturer("Sehr gut", 1980, "Niemcy");

        List<Manufacturer> list1 = new ArrayList<>();
        list1.add(manufacturer1);
        list1.add(manufacturer2);
        List<Manufacturer> list2 = new ArrayList<>();
        list2.add(manufacturer3);
        list2.add(manufacturer4);

        Car car1 = new Car("NZE", "Czerwony", 30.000, 2015,
                list1, EngineType.V8);
        Car car2 = new Car("NZE", "Czerwony", 30.000, 2015,
                list1, EngineType.V12);
        Car car3 = new Car("Kfiat", "Najszybszy", 420.000, 1955,
                list2, EngineType.V12);

        List<Car> cars = List.of(car1, car2, car3);

        CarService carService = new CarService();
        //dodawanie jednego auta
        carService.addCar(car1);
        //dodawanie listy aut
        carService.addCars(cars);
        //usuwanie auta z listy
        carService.removeCar(car1);
        //usuwanie wielu aut
        carService.removeCars(cars);
        //pobieranie listy aut
        carService.getCars();


        //samochody z minimum 3 producentami:
        carService.findCarsWithMinimum3Manufacturers();


    }
}
