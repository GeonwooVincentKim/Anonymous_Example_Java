package chap12;

import static java.lang.System.out;

public class MovieThread extends Thread {
    @Override
    public void run() {
        while (true) {
            out.println("동영상을 재생합니다");

            if (Thread.interrupted()) {
                break;
            }
        }
    }
}
