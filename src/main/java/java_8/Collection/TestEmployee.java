package java_8.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {

    public static void main(String[] args){
        ArrayList<Employee> e = new ArrayList<Employee>();
        e.add(new Employee(1, "Michael"));
        e.add(new Employee(5, "Pam"));
        e.add(new Employee(8, "Jim"));
        e.add(new Employee(3, "Dwight"));
        e.add(new Employee(4, "Angela"));
        e.add(new Employee(9, "Ryan"));
        Collections.sort(e, (e1, e2)-> e1.getEid()>e2.getEid()?1:e1.getEid()< e2.getEid()?-1:0);
        System.out.println("Ascending order : " +e);
        Collections.sort(e, (e1, e2)-> e1.getEid()>e2.getEid()?-1:e1.getEid()< e2.getEid()?1:0);
        System.out.println("Descending order : " +e);

    }
}
