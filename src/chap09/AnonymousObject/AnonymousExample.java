package chap09.AnonymousObject;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();

        annoy.field.wake();
        annoy.method1();

        annoy.method2(new Person() {
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다.");
                study();
            }
        });

        annoy.field3.wake();
    }
}
