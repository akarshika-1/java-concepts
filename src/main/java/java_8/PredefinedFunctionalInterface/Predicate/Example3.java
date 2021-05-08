package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Example3 {

    public static void main(String args[]){
        Predicate<String> p = Predicate.isEqual("DurgaSoft");
        System.out.println(p.test("DurgaSoft")); //true
        System.out.println(p.test("abc")); //false

    }
}
