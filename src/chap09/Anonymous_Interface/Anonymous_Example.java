package chap09.Anonymous_Interface;

import static java.lang.System.out;

public class Anonymous_Example {
    public static void main(String[] args) {
        Anonymous annoy = new Anonymous();
        annoy.field.turnOn();
        annoy.method1();

        annoy.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                out.println("SmartTV 를 켭니다.");
            }

            @Override
            public void turnOff() {
                out.println("SmartTV 를 끕니다.");
            }
        });

        annoy.field3.turnOn();
    }
}
