package java_8.PredefinedFunctionalInterface.Function;

import java.util.function.Function;

public class Example1 {
    public static void main(String args[]){
        Function<String, Integer> f1 = s -> s.length();
        System.out.println(f1.apply("Jessie"));
        System.out.println(f1.apply("Walter white"));
        Function<Integer, Integer> f2 = i ->i*i;
        System.out.println(f2.apply(5));
    }
}
