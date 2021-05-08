package java_8.DefaultAndStaticMethods;

public interface Left {

    default void m(){
        System.out.println("left implementation");
    }
}
