package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

class AddingThread extends Thread {
    BlockingQueue<String> bq;
    AddingThread(BlockingQueue<String> bq) {
        this.bq = bq;
    }
    public void run() {
        for(int i = 0; i < 3; i++) {
            bq.add("Element" + i);
            System.out.println("Element" + i + " has been added.");
        }
    }
}
