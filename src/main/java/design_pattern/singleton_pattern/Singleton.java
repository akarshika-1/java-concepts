package design_pattern.singleton_pattern;

public class Singleton {

    private static Singleton singletonInstance = new Singleton();

    private Singleton(){

    }

    //get the only object available
    public static Singleton getSingletonInstance(){
        return singletonInstance;
    }

    //no setter
}
