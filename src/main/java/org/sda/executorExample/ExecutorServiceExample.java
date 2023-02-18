package org.sda.executorExample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = prepareNumbers(10000);

        executeTasks(numbers);
    }

    private static void executeTasks(List<Integer> numbers) throws InterruptedException {
        List<Callable<Boolean>> tasks = new ArrayList<>();
        for (Integer num : numbers) {
            tasks.add(createTask(num));
        }
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.invokeAll(tasks);
        executorService.shutdown();
    }

    private static Callable<Boolean> createTask(Integer number) {
        return () -> {
            if (isEven(number)) {
                System.out.println("Liczba parzysta! " + number);
            }
            return true;
        };
    }

    private static boolean isEven(Integer number) {
        return number % 2 == 0;
    }

    private static List<Integer> prepareNumbers(int numberOfElements) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < numberOfElements; i++) {
            numbers.add((int) (Math.random() * numberOfElements));
        }
        return numbers;
    }
}
