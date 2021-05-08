package multi_threading.inter_thread_communication;

public class InterThread {
    public static void main(String[] args) {
        Increment increment = new Increment();
        new Producer(increment);
        new Consumer(increment);

    }
}
