package java_8.MethodAndConstrutorReference;

public class ConstructorReference {

    public static void main(String[] args) {
        Interface2 i2 = Sample::new; //constructor reference
        i2.get();
    }
}
