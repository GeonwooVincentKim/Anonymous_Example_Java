package chap09.Anonymous_Interface;

import static java.lang.System.out;

public class Anonymous {
    RemoteControl field = new RemoteControl() {
        @Override
        public void turnOn() {
            out.println("TV 를 켭니다");
        }

        @Override
        public void turnOff() {
            out.println("TV 를 끕니다.");
        }
    };

    void method1() {
        RemoteControl field2 = new RemoteControl() {
            @Override
            public void turnOn() {
                out.println("Audio 를 켭니다");
            }

            @Override
            public void turnOff() {
                out.println("Audio 를 끕니다.");
            }
        };
        field2.turnOn();
    }

    void method2(RemoteControl rc) {
        rc.turnOn();
    }

    RemoteControl field3 = new RemoteControl() {
        @Override
        public void turnOn() {
            out.println("전자레인지를 킵니다.");
            turnMiddle();
        }

        @Override
        public void turnOff() {
            out.println("전자레인지를 끕니다.");
        }

        public void turnMiddle() {
            out.println("전자레인지 절전");
        }
    };
}
