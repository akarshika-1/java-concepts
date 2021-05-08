package java_8.DefaultAndStaticMethods;

public class TestLeftRight implements Left, Right{

    public void m(){
        //System.out.println("override implementation");
      //  Left.super.m();
        Right.super.m();
    }

    public static void main(String[] args){
        TestLeftRight tlr = new TestLeftRight();
        tlr.m();
    }

}
