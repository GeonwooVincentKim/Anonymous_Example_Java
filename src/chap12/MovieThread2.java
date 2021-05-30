package chap12;

import static java.lang.System.out;

public class MovieThread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            out.println("동영상을 재생합니다");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                out.println("동영상 재생을 중지하였습니다.");
                e.printStackTrace();
            }

            if (Thread.interrupted()) {
                break;
            }
        }
    }
}
