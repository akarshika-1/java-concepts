package java_8.AnonymousInnerClass;

public class TestLambdaExpression {
    int x = 888;

    public void m1() {
        Inner i = ()-> {
            int x = 999;
            System.out.println(this.x);

        };
        i.m2();
    }

        public static void main(String[] args){
            TestLambdaExpression t = new TestLambdaExpression();
            t.m1();
        }
    }
