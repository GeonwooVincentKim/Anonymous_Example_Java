package chap14.Reader;

import java.io.FileReader;
import java.io.Reader;

import static java.lang.System.out;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        String fileLocate = "test8.txt";
        Reader reader = new FileReader("E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/" + fileLocate);
        out.println(reader);

        char[] buffer = new char[100];
        out.println(buffer);

        while (true) {
            int readCharNum = reader.read(buffer);
            if (readCharNum == -1)
                break;

            for (int i = 0; i < readCharNum; i++) {
                out.println(buffer[i]);
            }
        }

        reader.close();
    }
}
