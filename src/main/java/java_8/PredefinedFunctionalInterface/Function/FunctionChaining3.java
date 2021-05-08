package java_8.PredefinedFunctionalInterface.Function;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionChaining3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String username = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();

        Function<String, String> f1 = s -> s.substring(0,5);
        Function<String, String> f2 = s -> s.toLowerCase();

        if(f1.andThen(f2).apply(username).equals("durga")  && password.equals("java")){
            System.out.println("Valid User");
        }else{
            System.out.println("Invalid User");
        }
    }
}
