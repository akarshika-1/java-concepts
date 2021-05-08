package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Example2 {
    public static void main(String[] args){
        String[] a = {"Kelly", null, "Pam", "Jim", "Michael", "", "Dwight", "Ryan", "Kate"};
        Predicate<String> p = s -> s!=null && s.length()!=0;
        m(a, p);
    }

    private static void m(String[] a, Predicate p){
        for(String a1 : a){
            if(p.test(a1)){
                System.out.println(a1);
            }
        }
    }
}
