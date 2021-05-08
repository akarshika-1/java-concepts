package java_8.Stream;

import java.util.stream.Stream;

public class Example2 {

    public static void main(String args[]){
        Stream<Integer> i1 = Stream.of(9,99,999,9999,99999);
        i1.forEach(System.out::println);

        Double[] i2 = {2.2,4.0,5.6,1.3,7.4,8.5,9.6};
        Stream<Double> s = Stream.of(i2);
        s.forEach(System.out::println);
    }
}
