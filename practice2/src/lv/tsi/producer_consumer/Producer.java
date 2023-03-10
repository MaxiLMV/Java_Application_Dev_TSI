package lv.tsi.producer_consumer;

class Producer extends Thread {
    Goods param;
    Producer(Goods param) {
        this.param = param;
    }
    public void run() {
        while (true) {
            try {
                param.produce(20);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Produced: " + Goods.amount);
        }
    }
}
