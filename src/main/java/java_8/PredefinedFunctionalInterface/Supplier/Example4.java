package java_8.PredefinedFunctionalInterface.Supplier;

import java.util.function.Supplier;

public class Example4 {

    public static void main(String args[]){
        Supplier<String> s = () -> {
            Supplier<Integer> d = () -> (int)(Math.random()*10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
            String password = "";
            for(int i=0;i<8;i++){
                if(i%2==0){
                    password = password + d.get();
                }else {
                    password = password + c.get();
                }
            }
            return password;
        };
        System.out.println(s.get());


    }
}
