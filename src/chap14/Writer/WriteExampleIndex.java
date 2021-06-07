package chap14.Writer;

import static java.lang.System.out;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExampleIndex {
    public static void main(String[] args) throws Exception {
        String fileLocate = "test9.txt";
        Writer writer = new FileWriter("E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/" + fileLocate);

        char[] array = { 'A', 'B', 'C', 'D', 'E' };
        out.println(array);

        writer.write(array, 1, 3);
        writer.flush();
        writer.close();
    }
}
