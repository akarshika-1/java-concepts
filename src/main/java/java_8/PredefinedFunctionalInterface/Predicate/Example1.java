package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args){
        String[] a = {"Kelly", "Pam", "Jim", "Michael", "Dwight", "Ryan", "Kate"};
        Predicate<String> p = s -> s.charAt(0)=='K'; //check names start with K
        for(String arr : a){
            if(p.test(arr)){
                System.out.println(arr);
            }
        }

    }
}
