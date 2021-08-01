package Lambda;

import static java.lang.System.out;

public class LambdaExample {
    public static void main(String[] args) {
        InterfaceExample ie = (int x, int y) -> x + y;
        InterfaceExample ie1 = (x, y) -> x + y;
        // double sum = (double)(x, y) -> x + y;

        out.println(ie);
        out.println(ie.sum(1, 2));

        out.println(ie1);
        // out.println(ie1.sum(1.0, 2));
    }
}

interface InterfaceExample {
    public int sum(int x, int y);
}