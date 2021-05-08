package multi_threading.inter_thread_communication;

public class Producer implements Runnable{
    Increment increment;

    public Producer(Increment increment) {
        this.increment = increment;
        Thread thread = new Thread(this, "Producer");
        thread.start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            increment.put(i++);
            try{Thread.sleep(1000);}catch (Exception e){}
        }

    }
}
