package com.company.task13;

public class Report {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Ященко Александр Владимирович", 21000.3425);
        employees[1] = new Employee("Щербинина Елизавета Николаевна", 40000.231);
        employees[2] = new Employee("Марценюк Богдан Вячеславович", 5000.2314);
        generateReport(employees);
    }

    public static void generateReport(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.printf("\nРаботник - %s имеет зарплату \n%179.2f", employee.getFullname(), employee.getSalary());
        }
    }
}
