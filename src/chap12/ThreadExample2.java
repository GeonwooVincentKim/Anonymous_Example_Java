package chap12;

import static java.lang.System.out;

public class ThreadExample2 {
    public static void main(String[] args) {
        Thread thr = new MovieThread2();
        out.println(thr);

        thr.setDaemon(true);
        thr.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        out.println("시스템 종료");
    }
}
