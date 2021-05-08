package java_8.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

    public static void main(String args[]){
        List<Integer> l = Arrays.asList(8, 7, 45, 56, 78, 98, 13, 11, 43);
        List<Integer> a1 = l.stream().filter(s -> s%2==0).collect(Collectors.toList());
        System.out.println(a1);
        List<Integer> a2 = l.stream().map(a -> a*2).collect(Collectors.toList());
        System.out.println(a2);
        List<Integer> a3 = l.stream().sorted().collect(Collectors.toList());
        System.out.println(a3);
        List<Integer> a4 = l.stream().sorted((i, j) -> j.compareTo(i)).collect(Collectors.toList());
        System.out.println(a4);
        Integer min = l.stream().min((i, j) -> i.compareTo(j)).get();
        System.out.println(min);
        Integer max = l.stream().max((i,j) -> i.compareTo(j)).get();
        System.out.println(max);
        long count = l.stream().count();
        System.out.println(count);
        l.stream().forEach(System.out::print);
        Integer[] array = l.stream().toArray(Integer[]::new);
        for(Integer i : array){
            System.out.println(i);
        }
    }
}
