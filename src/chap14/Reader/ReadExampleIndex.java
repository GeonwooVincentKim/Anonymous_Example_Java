package chap14.Reader;

import static java.lang.System.out;

import java.io.FileReader;
import java.io.Reader;

public class ReadExampleIndex {
    public static void main(String[] args) throws Exception {
        String fileLocate = "test9.txt";
        Reader reader = new FileReader("E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/" + fileLocate);
        out.println(reader);

        char[] buffer = new char[5];
        out.println(buffer);

        int readCharNum = reader.read(buffer, 2, 3);
        if (readCharNum != -1) {
            for (int i = 0; i < buffer.length; i++) {
                out.println(buffer[i]);
            }
        }

        reader.close();
    }
}
