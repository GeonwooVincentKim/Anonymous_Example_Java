package chap09.AnonymousObject;

import static java.lang.System.out;

public class Anonymous {
    Person field = new Person() {
        void work() {
            out.println("출근합니다");
        }

        @Override
        void wake() {
            out.println("일어납니다");
            work();
        }
    };

    void method1() {
        Person field2 = new Person() {
            void walk() {
                out.println("산책합니다.");
            }

            @Override
            void wake() {
                out.println("7시 기상");
                walk();
            }
        };
        field2.wake();
    }

    void method2(Person person) {
        person.wake();
    }

    Person field3 = new Person();
}
