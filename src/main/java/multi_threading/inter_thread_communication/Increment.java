package multi_threading.inter_thread_communication;

public class Increment {

    int num;
    boolean valueSet;

    public synchronized void put(int num){
        while(valueSet){
            try {
                wait();
            }catch (Exception e){}
        }
        System.out.println("Put "+ num);
        this.num = num;
        valueSet = true;
    }

    public synchronized void get(){
        while(!valueSet){
            try {
                wait();
            }catch (Exception e){}
        }
        System.out.println("Get "+ num);
        valueSet = false;
    }
}
