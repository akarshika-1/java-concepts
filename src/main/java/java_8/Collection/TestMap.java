package java_8.Collection;

import java.util.TreeMap;

public class TestMap {

    public static void main(String[] args){
        TreeMap<Integer, String> m = new TreeMap<Integer, String>((o1,o2)->o1>o2?-1:o1<o2?1:0);
        m.put(1, "ross");
        m.put(4,"rachael");
        m.put(76, "monica");
        m.put(15, "chandler");
        m.put(45, "phoebe");
        m.put(9, "joey");
        System.out.println(m);
    }
}
