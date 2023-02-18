package org.company;

import org.company.model.Employee;
import org.company.model.enums.Position;
import org.company.repository.EmployeeRepository;
import org.company.service.EmployeeService;
import org.company.service.EmployeeServiceImpl;

import java.util.Scanner;

public class CompanyApp {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) throws InterruptedException {
        Employee employee1 = Employee.builder().name("Jan")
                .surname("Kowalski").position(Position.DEVELOPER).build();
        Employee employee2 = Employee.builder().name("Katarzyna")
                .surname("Janas").position(Position.PRODUCT_OWNER).build();
        EmployeeRepository.add(employee1);
        EmployeeRepository.add(employee2);

        CompanyApp companyApp = new CompanyApp();
        companyApp.run();
    }

    private void run() throws InterruptedException {
        EmployeeService employeeService = new EmployeeServiceImpl();

        System.out.println("Witaj w systemie zarządzania pracownikami!");
        Thread.sleep(1000);

        boolean on = true;
        while (on) {
            showMenu();
            System.out.println("Wpisz odpowiednią liczbę: ");
            int decision = SCANNER.nextInt();
            switch (decision) {
                case 1 -> printAllEmployees(employeeService);
                case 2 -> addNewEmployee(employeeService);
                case 3 -> removeEmployee(employeeService);
                case 0 -> {
                    on = false;
                    System.out.println("Do widzenia!");
                }
                default -> System.out.println("Nie ma takiej operacji");
            }
        }
    }

    private void showMenu() {
        System.out.println("Jaką operację chcesz wykonać?");
        System.out.println("1 - Wyświetl listę pracowników");
        System.out.println("2 - Dodaj nowego pracownika");
        System.out.println("3 - Usun pracownika");
        System.out.println("0 - Zakończ program");
    }

    private void printAllEmployees(EmployeeService employeeService) {
        for (Employee employee : employeeService.getAllEmployees()) {
            System.out.println(employee);
        }
    }

    private void addNewEmployee(EmployeeService employeeService) {
        Employee employee = new Employee();
        System.out.println("Podaj imię: ");
        String name = SCANNER.next();
        employee.setName(name);
        System.out.println("Podaj nazwisko");
        String surname = SCANNER.next();
        employee.setSurname(surname);
        System.out.println("Podaj stanowisko (DEVELOPER, SCRUM_MASTER, PRODUCT_OWNER):");
        String position = SCANNER.next();
        employee.setPosition(Position.valueOf(position));
        employeeService.addEmployee(employee);
        System.out.println("Dodano nowego pracownika: " + employee);
    }

    //TODO zaimplementować usuwanie pracownika po id!!!
    private void removeEmployee(EmployeeService employeeService) {

    }
}
