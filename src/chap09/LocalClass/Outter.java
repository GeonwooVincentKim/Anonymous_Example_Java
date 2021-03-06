package chap09.LocalClass;

public class Outter {
    public void method1(final int arg) {
        final int localVariable = 1;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    public void method2(int arg) {
        int localVariable = 1;

        class Inner {
            public void method() {
                int result = arg + localVariable;
            }
        }
    }

    String field = "Outter-field";

    void method() {
        System.out.println("Outter-method");
    }

    class Nested {
        String field = "Nested-Field";

        void method() {
            System.out.println("Nested-Method");
        }

        void print() {
            System.out.println(this.field);
            this.method();

            System.out.println(Outter.this.field);

            Outter.this.method();
        }
    }
}
