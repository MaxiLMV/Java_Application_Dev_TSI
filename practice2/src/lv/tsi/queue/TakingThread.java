package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

class TakingThread extends Thread {
    BlockingQueue<String> bq;
    TakingThread(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for(int i = 0; i < 3; i++) {
            try {
                bq.take();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Element" + i + " has been taken.");
        }
    }
}
