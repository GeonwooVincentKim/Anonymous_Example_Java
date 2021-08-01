package Lambda;

import static java.lang.System.out;

public class LambdaExample2 {
    public static void main(String[] args) {
        LambdaInterface lambdaExample = () -> {
            String str = "Test";
            out.println(str);
        };

        lambdaExample.method();

        out.println("-----------------------");
        Outer o = new Outer();
        out.println(o);
        o.method();
    }
}

@FunctionalInterface
interface LambdaInterface {
    void method();
}

class Outer {
    public int iv = 10;

    void method() {
        final int iv = 40;
        LambdaInterface f5 = () -> {
            out.println("Outer.this.iv : " + Outer.this.iv);
            out.println("this.iv : " + this.iv);
            out.println("iv : " + iv);
        };
        f5.method();
    }
}
