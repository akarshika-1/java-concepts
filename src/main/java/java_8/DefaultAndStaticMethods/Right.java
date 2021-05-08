package java_8.DefaultAndStaticMethods;

public interface Right {

    default void m(){
        System.out.println("Right implementation");
    }
}
