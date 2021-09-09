package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeList {
    private final List<Employee> employees = new ArrayList<Employee>();

    private void capitalizeName(Employee employee) {
        employee.setName(employee.getName().toUpperCase());
    }

    public void push(Employee employee) {
        capitalizeName(employee);
        this.employees.add(employee);
    }

    public void displayAll() {
        for (Employee employee : this.employees) {
            System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge());
        }
    }

    public void displayOver18() {
        for (Employee employee : this.employees) {
            if (employee.getAge() > 17) {
                System.out.println("Name: " + employee.getName() + " Age: " + employee.getAge());
            }
        }
    }

    public void sortArrayAtoZ() {
        Collections.sort(this.employees, new EmployeeComparator());
    }

    public void sortArrayZtoA() {
        Collections.sort(this.employees, new EmployeeComparator().reversed());
    }
}
