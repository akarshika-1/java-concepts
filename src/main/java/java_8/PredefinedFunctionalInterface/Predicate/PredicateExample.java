package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main(String args[]){
        Predicate<Integer> i = t -> t>10;
        System.out.println(i.test(19));
        Predicate<String> s = t -> t.length()>5;
        System.out.println(s.test("abs"));
        System.out.println(s.test("abscdf"));
        Predicate<Collection> pc = p -> p.isEmpty();
        ArrayList<String> a = new ArrayList<>();
        a.add("abc");
        System.out.println(pc.test(a));

    }
}
