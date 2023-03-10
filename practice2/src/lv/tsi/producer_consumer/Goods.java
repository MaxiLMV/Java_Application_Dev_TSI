package lv.tsi.producer_consumer;

class Goods {
    static int amount;
    Goods(int amount) {
        Goods.amount = amount;
    }
    synchronized void produce(int amount) throws InterruptedException {
        while(amount != 0) {
            wait();
            if (amount == 0) {
                amount = 20;
                notify();
            }
        }
    }
    synchronized int consume() throws InterruptedException {
        while (amount == 0) wait();
        notify();
        return amount;
    }
}
