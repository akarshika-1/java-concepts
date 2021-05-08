package design_pattern.singleton_pattern;

import design_pattern.factory_pattern.Teacher;

public class SingletonPatternMainClass {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonInstance();
        Singleton s2 = Singleton.getSingletonInstance();
        //Same value of hashcode will be printed
        System.out.println(s1);
        System.out.println(s2);

        System.out.println();

        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher();
        //Different value of hashcode will be printed
        System.out.println(t1);
        System.out.println(t2);
    }
}
