package java_8.PredefinedFunctionalInterface.Function;

import java.util.function.Function;

public class IdentityExample {

    public static void main(String args[]){
        Function<String, String> f = Function.identity();
        System.out.println(f.apply("moira rose"));
    }
}
