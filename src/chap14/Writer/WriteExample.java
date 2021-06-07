package chap14.Writer;

import java.io.FileWriter;
import java.io.Writer;

import static java.lang.System.out;

public class WriteExample {
    public static void main(String[] args) throws Exception {
        String fileLocate = "test8.txt";
        Writer writer = new FileWriter("E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/" + fileLocate);
        out.println(writer);

        char[] array = { 'A', 'B', 'C' };
        out.println(array);

        writer.write(array);

        writer.flush();
        writer.close();
    }
}
