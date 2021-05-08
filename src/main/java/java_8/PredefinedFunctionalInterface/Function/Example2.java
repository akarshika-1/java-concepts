package java_8.PredefinedFunctionalInterface.Function;

import java.util.function.Function;

public class Example2 {
    public static void main(String args[]){
        String s = "That's what she said ";
        Function<String, Integer> f1 = str -> str.length() - str.replaceAll(" ", "").length();
        System.out.println(f1.apply(s));
    }
}
