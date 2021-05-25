package chap11;

import static java.lang.System.out;

public class StringEquals {
    public static void main(String[] args) {
        String strVar1 = new String("홍길동");
        out.println(strVar1);

        String strVar2 = "홍길동";
        out.println(strVar2);

        if (strVar1 == strVar2) {
            out.println("같은 String 객체를 참조");
        } else {
            out.println("다른 String 객체를 참조");
        }

        if (strVar1.equals(strVar2)) {
            out.println("같은 문자열을 가짐");
        } else {
            out.println("다른 문자열을 가짐");
        }
    }
}