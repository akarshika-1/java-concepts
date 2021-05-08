package multi_threading.inter_thread_communication;

public class Consumer implements Runnable{
    Increment increment;

    public Consumer(Increment increment) {
        this.increment = increment;
        Thread thread = new Thread(this, "Consumer");
        thread.start();
    }

    @Override
    public void run() {
        while (true){
            increment.get();
            try{Thread.sleep(2000);}catch (Exception e){}
        }

    }
}
