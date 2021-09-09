package org.example;

public class App {
    public static void main(String[] args) {
        EmployeeList employeeList = new EmployeeList();
        fillEmployeeList(employeeList);
        demoDisplay(employeeList);
    }

    public static void fillEmployeeList(EmployeeList employeeList) {
        employeeList.push(new Employee(1, "Adem", 22));
        employeeList.push(new Employee(2, "Arthur", 26));
        employeeList.push(new Employee(3, "Zinedine", 19));
        employeeList.push(new Employee(4, "Paolo", 24));
        employeeList.push(new Employee(4, "L'âne trotro", 6));
    }

    public static void demoDisplay(EmployeeList employeeList) {
        System.out.println("A to Z list");
        employeeList.sortArrayAtoZ();
        employeeList.displayAll();

        System.out.println("\nZ to A list");
        employeeList.sortArrayZtoA();
        employeeList.displayAll();

        System.out.println("\nOver 18 list");
        employeeList.sortArrayAtoZ();
        employeeList.displayOver18();
    }
}
