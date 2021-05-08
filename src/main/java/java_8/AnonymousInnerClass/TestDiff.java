package java_8.AnonymousInnerClass;

public class TestDiff {

    int x=10;

    public void m2(){
        int y=20;
        Diff d = () -> {
            System.out.println(x);
            System.out.println(y);

        };
        d.m1();
    }

    public static void main(String[] args){
        TestDiff td = new TestDiff();
        td.m2();
    }
}
