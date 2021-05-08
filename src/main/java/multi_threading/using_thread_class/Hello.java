package multi_threading.using_thread_class;

public class Hello extends Thread{

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Hello");
            try{Thread.sleep(1000);}catch(Exception e){}
        }
    }
}
