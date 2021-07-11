package lottery_number_test.Attributes.FileAttribute;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import lottery_number_test.Attributes.Files;

import static java.lang.System.out;

public class FileAttributes implements Files {
    private Scanner fileReader;
    private FileWriter fileWriter;

    @Override
    public Scanner readFile(String fileName) {
        File file = new File(fileName);

        try {
            fileReader = new Scanner(file);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return fileReader;
    }

    @Override
    public void writeFile(String fileName, String result) {

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.write(result);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            out.println(e.getMessage());
            out.println("---------------");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
