package multi_threading.using_thread_class;

public class ThreadDemo {

    public static void main(String[] args) {
        Hello hello = new Hello();
        Hi hi = new Hi();
        //start() method always call run() method
        hi.start();
        try{Thread.sleep(10);}catch(Exception e){}
        hello.start();
    }
}
