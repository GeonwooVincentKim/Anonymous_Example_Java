package chap11;

import java.util.Scanner;
import static java.lang.System.out;

public class StringEqualsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("입력하세요 : ");

        String userInputString = sc.nextLine();

        if ((userInputString.indexOf("a") != -1) || (userInputString.indexOf("e") != -1)
                || (userInputString.indexOf("i") != -1) || (userInputString.indexOf("o") != -1)
                || (userInputString.indexOf("u") != -1)) {
            out.println("모음 단어가 어딘가에 있군요");
        } else {
            out.println("응 없어~");
        }

        sc.close();
    }
}
