package java_8.Collection;

public class ThreadDemo {

    public static void main(String[] args){
        Thread t = new Thread(()->
        {
            for(int i=0;i<10;i++){
                System.out.println("child thread");
            }
        });
        t.start();
        for(int j=0;j<10;j++){
            System.out.println("main thread");
        }
    }
}
