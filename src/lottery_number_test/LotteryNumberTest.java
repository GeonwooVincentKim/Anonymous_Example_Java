package lottery_number_test;

import static java.lang.System.out;

import java.util.Scanner;

public class LotteryNumberTest {
    public static int[] getRandomNumber(int getUserInput) {
        int[] lengthArray = new int[getUserInput];

        for (int i = 0; i < getUserInput; i++) {
            lengthArray[i] = (int) (Math.random() * (50 - 10 + 1)) + 10;

            i = checkValueExist(lengthArray, i);
            out.print(lengthArray[i] + " ");
        }

        return lengthArray;
    }

    public static String printArray(int[] array) {
        String result = "";

        for (int i = 0; i < array.length; i++) {
            result += array[i] + " ";
        }

        return result;

    }

    public static int checkValueExist(int[] lengthArray, int i) {
        int count = i;

        for (int j = 0; j < i; j++) {
            if (lengthArray[i] == lengthArray[j]) {
                count--;
                break;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userSelectLength = sc.nextInt();
        int[] lengthArray = getRandomNumber(userSelectLength);
        out.println();

        String printResult = printArray(lengthArray);
        out.println(printResult);

        sc.close();
    }
}
