package lv.tsi.sync;

class TaskThread extends Thread {
    static String name;
    Thread threadName = new Thread();
    int taskId;
    TaskManager obj;
    TaskThread(String name, int taskId, TaskManager obj) {
        TaskThread.name = name;
        threadName.setName(name);
        this.taskId = taskId;
        this.obj = obj;
    }
    public void run() {
        TaskManager.performTask(threadName, taskId);
    }
}
