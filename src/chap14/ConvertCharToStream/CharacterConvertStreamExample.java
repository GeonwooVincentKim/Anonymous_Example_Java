package chap14.ConvertCharToStream;

import static java.lang.System.out;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class CharacterConvertStreamExample {
    public static void main(String[] args) throws Exception {
        write("문자 변환 스트림을 사용합니다.", "test1.txt");
        String data = read("test1.txt");
        out.println(data);
    }

    public static String read(String fileName) throws Exception {
        FileInputStream fis = new FileInputStream(
                "E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/ConvertCharToStream/" + fileName);
        out.println(fis);

        Reader reader = new InputStreamReader(fis);
        char[] buffer = new char[100];
        int readCharNum = reader.read(buffer);
        reader.close();

        String data = new String(buffer, 0, readCharNum);
        return data;
    }

    public static void write(String str, String fileName) throws Exception {
        FileOutputStream fos = new FileOutputStream(
                "E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/ConvertCharToStream/" + fileName);
        out.println(fos);

        Writer writer = new OutputStreamWriter(fos);
        writer.write(str);
        writer.flush();
        writer.close();
    }
}
