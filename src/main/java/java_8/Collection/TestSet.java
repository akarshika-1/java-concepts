package java_8.Collection;

import java.util.TreeSet;

public class TestSet {

    public static void main(String[] args){
        TreeSet<Integer> t = new TreeSet<Integer>((o1,o2) -> o1>o2?-1:o1<o2?1:0);
        t.add(23);
        t.add(45);
        t.add(15);
        t.add(43);
        t.add(13);
        System.out.println(t);
    }
}
