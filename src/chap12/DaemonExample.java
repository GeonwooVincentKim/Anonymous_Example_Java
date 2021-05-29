package chap12;

import static java.lang.System.out;

public class DaemonExample {
    public static void main(String[] args) {
        AutoSaveThread aThr = new AutoSaveThread();
        // out.println(aThr);

        aThr.setDaemon(true);
        aThr.start();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        out.println("메인 스레드 종료");
    }
}
