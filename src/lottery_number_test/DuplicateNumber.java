package lottery_number_test;

import static java.lang.System.out;

import java.util.Scanner;

public class DuplicateNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        out.println("원하는 메뉴를 선택하세요.\n1. File 입출력\n2. 직접 입력");
        int userSelection = sc.nextInt();

        if (userSelection == 1) {
            out.println(userSelection);
        } else if (userSelection == 2) {
            out.println(userSelection);
        }

        sc.close();
    }
}
