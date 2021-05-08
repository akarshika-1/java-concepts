package java_8.DefaultAndStaticMethods;

public class TestMyDefault implements Default{

    @Override
    public void m1(){
        System.out.println("my own default implementation");
    }

    public static void main(String[] args){
        Default d = new TestMyDefault();
        d.m1();
    }
}
