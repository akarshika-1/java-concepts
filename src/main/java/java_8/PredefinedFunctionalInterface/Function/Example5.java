package java_8.PredefinedFunctionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example5 {

    public static void main(String[] args){
        Predicate<Employee> p = e -> e.getSalary()<3500;
        List<Employee> employees = new ArrayList<>();
        populate(employees);
        Function<Employee, Employee> f = s -> {
            s.setSalary(s.getSalary()+433);
            return s;
        };
        for(Employee e :employees){
            if(p.test(e)){
                System.out.println(f.apply(e));
            }
        }

    }
    public static void populate(List<Employee> employeeList){
        employeeList.add(new Employee("Pam", new Double("3400")));
        employeeList.add(new Employee("Jim", new Double("8000")));
        employeeList.add(new Employee("Michael", new Double("7000")));
        employeeList.add(new Employee("Dwight", new Double("6000")));
    }
}
