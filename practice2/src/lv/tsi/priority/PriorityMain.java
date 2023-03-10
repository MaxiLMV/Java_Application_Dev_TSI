package lv.tsi.priority;

class PriorityMain {
    public static void main(String[] args) {
        PriorityThread min = new PriorityThread("min");
        min.run();
        PriorityThread norm = new PriorityThread("norm");
        norm.run();
        PriorityThread max = new PriorityThread("max");
        max.run();
    }
}
