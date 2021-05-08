package java_8.PredefinedFunctionalInterface.Predicate;

import java.util.function.Predicate;

public class PredicateJoin {
    public static void main(String args[]){
        int x[] = {1,2,5,8,32,56,45,87,90,21};
        Predicate<Integer> p1 = i -> i>10;
        Predicate<Integer> p2 = i -> i%2==0;
        m(p1.negate(), x);
        System.out.println("................");
        m(p1.and(p2),x);
        System.out.println("................");
        m(p1.or(p2), x);

    }

    public static void m(Predicate p, int[] x ){
        for(int x1:x){
            if(p.test(x1)){
                System.out.println(x1);
            }

        }
    }
}
