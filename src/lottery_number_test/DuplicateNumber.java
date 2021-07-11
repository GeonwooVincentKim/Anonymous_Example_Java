package lottery_number_test;

import static java.lang.System.out;

import java.util.Scanner;

public class DuplicateNumber {
    public static int getRandomNumber(int minimum, int maximum) {
        return (int) (Math.random() * (maximum - minimum + 1)) + minimum;
    }

    public static int[] getRandomArray(int userLength) {
        int[] randomArray = new int[userLength];

        for (int i = 0; i < userLength; i++) {
            randomArray[i] = getRandomNumber(10, 50);
        }

        return randomArray;
    }

    public static String printRandomArray(int[] randomArray) {
        String loopResult = "";

        for (int i = 0; i < randomArray.length; i++) {
            loopResult += randomArray[i] + " ";
        }

        return loopResult;
    }

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
