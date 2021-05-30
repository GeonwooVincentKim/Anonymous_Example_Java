package chap12;

import static java.lang.System.out;

public class ThreadExample {
    public static void main(String[] args) {
        Thread thr = new MovieThread();
        out.println(thr);

        thr.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thr.interrupt();
    }
}
