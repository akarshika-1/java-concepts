package multi_threading.using_runnable_interface;

public class Hello implements Runnable{
    @Override
    public void run() {
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }

    }
}
