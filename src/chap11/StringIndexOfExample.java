package chap11;

import static java.lang.System.out;

public class StringIndexOfExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";
        out.println(subject);

        int location = subject.indexOf("프로그래밍");
        out.println(location);

        if (subject.indexOf("자바") != -1) {
            out.println("자바와 관련된 책이군요");
        } else {
            out.println("자바와 관련없는 책이군요");
        }
    }
}
