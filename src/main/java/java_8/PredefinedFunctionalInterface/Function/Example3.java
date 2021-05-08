package java_8.PredefinedFunctionalInterface.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example3 {
    public static void main(String args[]){
        List<Student> l = new ArrayList<>();
        populate(l);
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
        Predicate<Student> p = student -> student.getMarks()>35;
        for(Student s : l){
            if(p.test(s)){
                System.out.println("Name : "+s.getName());
                System.out.println("Marks : "+s.getMarks());
                System.out.println("Grade : "+f.apply(s));
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
