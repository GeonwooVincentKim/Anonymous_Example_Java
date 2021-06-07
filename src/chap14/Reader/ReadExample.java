package chap14.Reader;

import java.io.FileReader;
import java.io.Reader;

import static java.lang.System.out;

public class ReadExample {
    public static void main(String[] args) throws Exception {
        String fileLocate = "test8.txt";
        Reader reader = new FileReader("E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/" + fileLocate);
        out.println(reader);
    }
}
