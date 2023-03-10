package lv.tsi.sync;

class SyncMain {
    public static void main(String[] args) throws InterruptedException {
        final TaskManager obj = new TaskManager();
        TaskThread name1 = new TaskThread("name1", 1, obj);
        TaskThread name2 = new TaskThread("name2", 2, obj);
        name1.run();
        Thread.sleep(2);
        name2.run();
    }
}

