package java_8.MethodAndConstrutorReference;

public class InstanceMethodReference {

    public void m1(){
        for(int i=0; i<10; i++){
            System.out.println("Child Thread");
        }
    }

    public static void main(String[] args) {
        InstanceMethodReference instanceMethodReference = new InstanceMethodReference();
        Runnable r = instanceMethodReference::m1;
        Thread t = new Thread(r);
        t.start();
        for(int i=0; i<10; i++){
            System.out.println("Main Thread");
        }

    }
}
