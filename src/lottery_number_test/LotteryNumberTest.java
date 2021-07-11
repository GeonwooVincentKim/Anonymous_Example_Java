package lottery_number_test;

import static java.lang.System.out;

import java.util.Scanner;

public class LotteryNumberTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userSelectLength = sc.nextInt();
        int[] lengthArray = new int[userSelectLength];

        for (int i = 0; i < userSelectLength; i++) {
            lengthArray[i] = (int) (Math.random() * (50 - 10 + 1)) + 1;
            int number = lengthArray[i];

            if (lengthArray[i] == number) {
            }
        }

        sc.close();
    }
}
