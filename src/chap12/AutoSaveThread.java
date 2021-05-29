package chap12;

import static java.lang.System.out;

public class AutoSaveThread extends Thread {
    public void save() {
        out.println("작업 내용을 저장함");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            } catch (Exception e) {
                e.printStackTrace();
                break;
            }

            save();
        }
    }
}
