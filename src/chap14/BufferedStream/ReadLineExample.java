package chap14.BufferedStream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;

import static java.lang.System.out;

public class ReadLineExample {
    public static void main(String[] args) throws Exception {
        Reader reader = new FileReader(ReadLineExample.class.getResource("language.txt").getPath());
        out.println(reader);

        BufferedReader br = new BufferedReader(reader);
        out.println(br);

        while (true) {
            String data = br.readLine();
            if (data == null)
                break;

            out.println(data);
        }

        br.close();
    }
}
