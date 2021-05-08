package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class AuthenticationExample {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username : ");
        String userName = sc.next();
        System.out.println("Enter password : ");
        String password = sc.next();
        User user =new User(userName, password);
        Predicate<User> p = u -> u.getUserName().equals("durga") && u.getPassword().equals("java");
        if(p.test(user)){
            System.out.println("Valid User");
        }else{
            System.out.println("Invalid User");
        }
    }

}
