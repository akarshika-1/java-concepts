package java_8.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class TestList {

    public static void main(String[] args){
        ArrayList<Integer> l = new ArrayList<>();
        l.add(19);
        l.add(10);
        l.add(34);
        l.add(25);
        l.add(14);
        Collections.sort(l,(o1,o2) -> o1>o2?-1:o1<o2?1:0);
        System.out.println(l);
    }
}
