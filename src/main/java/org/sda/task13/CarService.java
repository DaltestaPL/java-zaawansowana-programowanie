package org.sda.task13;

import org.sda.task12.Car;
import org.sda.task12.EngineType;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ZADANIE 13.
 * Stwórz klasę CarService, która będzie zawierać w sobie listę aut,
 * oraz będzie realizować poniższe metody:
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
public class CarService {

    private final List<Car> cars;

    public CarService() {
        this.cars = new ArrayList<>();
    }

    public CarService(List<Car> cars) {
        this.cars = cars;
    }

    public void addCar(Car car) {
        this.cars.add(car);
    }

    public void addCars(List<Car> cars) {
        this.cars.addAll(cars);
    }

    public void removeCar(Car car) {
        this.cars.remove(car);
    }

    public void removeCars(List<Car> cars) {
        this.cars.removeAll(cars);
    }

    public List<Car> getCars() {
        return this.cars;
    }

    //zwracanie aut z silnikiem V12
    public List<Car> findV12Cars() {
        return cars.stream().filter(car -> EngineType.V12.equals(car.getEngineType()))
                .collect(Collectors.toList());
    }

    public List<Car> findCarsByEngineType(EngineType engineType) {
        return cars.stream().filter(car -> engineType.equals(car.getEngineType()))
                .collect(Collectors.toList());
    }

    //* zwracanie aut wyprodukowanych przed rokiem 1999
    public List<Car> findCarsProducedBy1999() {
        return cars.stream().filter(car -> car.getRokProdukcji()< 1999)
                .collect(Collectors.toList());
    }

    //zwracanie najdroższego auta,
    public Car mostExpensive() {
        List<Car> temp = this.cars;
        temp.sort((car1, car2) -> car2.getCena().compareTo(car1.getCena()));
        return temp.get(0);
    }

    //TODO Praca domowa - napisać metodę zwracającą najtańszy samochód - użyć pętli for
    //zwracanie najtańszego auta


    //zwracanie auta z co najmniej 3 producentami,
    public List<Car> findCarsWithMinimum3Manufacturers() {
        return cars.stream().filter(car -> car.getListaProducentow().size() >= 3)
                .collect(Collectors.toList());
    }

    //zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
    public List<Car> getSortedCars(SortType type) {
        List<Car> temp = this.cars;
        switch (type) {
            case ASC -> {
                temp.sort(Comparator.comparingDouble(Car::getCena));
                System.out.println("Posortowano: " + type.getType());
                return temp;
            }
            case DESC -> {
                temp.sort(Comparator.comparingDouble(Car::getCena).reversed());
                System.out.println("Posortowano: " + type.getType());
                return temp;
            }
            default -> throw new RuntimeException("Nie udało się posortować");
        }
    }
}
