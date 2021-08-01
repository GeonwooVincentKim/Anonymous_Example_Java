package Lambda;

import static java.lang.System.out;

public class LambdaExample2 {
    public static void main(String[] args) {
        LambdaInterface lambdaExample = () -> {
            String str = "Test";
            out.println(str);
        };

        lambdaExample.method();
    }
}

@FunctionalInterface
interface LambdaInterface {
    void method();
}
