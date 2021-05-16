package chap09.LocalClass;

public class OutterExample {
    public static void main(String[] args) {
        Outter outter = new Outter();

        Outter.Nested nested = outter.new Nested();
        // System.out.println(nested.field);
        nested.print();
    }
}
