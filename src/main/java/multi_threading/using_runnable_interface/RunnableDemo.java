package multi_threading.using_runnable_interface;

import multi_threading.using_runnable_interface.Hello;
import multi_threading.using_runnable_interface.Hi;

public class RunnableDemo {

    public static void main(String[] args) {
        Runnable hi = new Hi();
        Runnable hello = new Hello();
        Thread t1 = new Thread(hi);
        Thread t2 = new Thread(hello);
        t1.start();
        try{Thread.sleep(10);}catch(Exception e){}
        t2.start();
    }
}
