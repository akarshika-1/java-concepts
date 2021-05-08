package java_8.PredefinedFunctionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Example4 {

    public static void main(String[] args){
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        Function<List<Employee>, Double> f = e -> {
            double total = 0;
            for(Employee employee : employees){
                total = total+employee.getSalary();
            }
            return total;
        };
        System.out.println(f.apply(employees));
    }

    public static void populate(List<Employee> employeeList){
        employeeList.add(new Employee("Pam", new Double("5000")));
        employeeList.add(new Employee("Jim", new Double("8000")));
        employeeList.add(new Employee("Michael", new Double("7000")));
        employeeList.add(new Employee("Dwight", new Double("6000")));
    }
}
