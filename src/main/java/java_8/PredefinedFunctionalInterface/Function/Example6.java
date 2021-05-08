package java_8.PredefinedFunctionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example6 {

    public static void main(String args[]){
        List<Student> students = new ArrayList<>();
        populate(students);
        Predicate<Student> p = s -> s.getMarks()>60;
        Function<Student, String> f = student -> {
            int m = student.getMarks();
            if(m<35){
                return "fail";
            }else if(m>=35 && m<65){
                return "average";
            }else if(m>=65 && m<80){
                return "Good";
            }else {
                return "Excellent";
            }
        };
        Consumer<Student> c = s -> {
            System.out.println(s);
            System.out.println(f.apply(s));
        };
        for(Student s : students){
            if(p.test(s)){
                c.accept(s);
            }
        }

    }

    private static void populate(List<Student> l){
        l.add(new Student("Pam", 25));
        l.add(new Student("Jim", 89));
        l.add(new Student("Michael", 75));
        l.add(new Student("Dwight", 63));
    }
}
