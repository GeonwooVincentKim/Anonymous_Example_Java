package chap14.BufferedStream;

import static java.lang.System.out;

import java.io.*;

public class BufferedStreamExample {
    public static void main(String[] args) throws Exception {
        String originalFilePath1 = BufferedStreamExample.class.getResource("originalFile1.jpg").getPath();
        String targetFilePath1 = "E:/Java_HonGong/JavaClassBasicStudy/NestedClass/src/chap14/BufferedStream/targetFile2.jpg";

        FileInputStream fis = new FileInputStream(originalFilePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);
        out.println(fis);
        out.println(fos);

        String originalFilePath2 = BufferedStreamExample.class.getResource("originalFile2.jpg").getPath();
        out.println(originalFilePath2);

        String targetFilePath2 = BufferedStreamExample.class.getResource("originalFile2.jpg").getPath();
        out.println(targetFilePath2);

        FileInputStream fis2 = new FileInputStream(originalFilePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        out.println(fis2);
        out.println(fos2);

        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        out.println("버퍼를 사용하지 않았을 때 : \t" + nonBufferTime + "ns");

        long bufferTime = copy(bis, bos);
        out.println("버퍼를 사용했을 때 : \t\t" + bufferTime + "ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();
    }

    static int data = -1;

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            data = is.read();
            if (data == -1)
                break;

            os.write(data);
        }

        os.flush();
        long end = System.nanoTime();

        return (end - start);
    }
}
