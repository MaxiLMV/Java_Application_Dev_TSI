package lv.tsi.sync;

class TaskManager {
    synchronized static void performTask(Thread threadName, int taskId) {
        System.out.println(threadName.getName() + " " + taskId);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName.getName() + " " + taskId);
    }

}