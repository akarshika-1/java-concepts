package java_8.AnonymousInnerClass;

public class TestAnonymousInner {

    int x = 888;
    public void m1(){
        Inner i = new Inner() {
            int x=999;
            @Override
            public void m2() {
                System.out.println(this.x);
            }
        };
        i.m2();
    }

    public static void main(String[] args){
        TestAnonymousInner t = new TestAnonymousInner();
        t.m1();
    }
}
