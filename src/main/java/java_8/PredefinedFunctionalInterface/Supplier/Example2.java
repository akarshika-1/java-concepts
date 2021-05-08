package java_8.PredefinedFunctionalInterface.Supplier;

import java.util.function.Supplier;

public class Example2 {

    public static void main(String args[]){
        String[] names = {"John", "Moira", "David", "Alexis", "Jocelyn", "Roland"};
        Supplier<String> s = () -> {
            int i = (int)(Math.random()*6);
            return names[i];
        };
        System.out.println(s.get());
    }
}
