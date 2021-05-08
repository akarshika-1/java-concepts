package java_8.MethodAndConstrutorReference;

public class StaticMethodReference {

    public static void m2(){
        System.out.println("Implementation by Method reference ");
    }

    public static void main(String[] args) {
        Interface1 i1 = StaticMethodReference::m2;
        i1.m1();
    }
}
