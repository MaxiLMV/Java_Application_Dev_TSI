package lv.tsi.producer_consumer;

class Consumer extends Thread {
    Goods param;
    Consumer(Goods param) {
        this.param = param;
    }
    public void run() {
        while (true) {
            try {
                param.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Consumed: " + Goods.amount);
        }
    }
}
