package lottery_number_test.FileAttribute;

import java.util.Scanner;

public interface Files {
    public Scanner readFile(String fileName);

    public void writeFile(String fileName, String result);
}
