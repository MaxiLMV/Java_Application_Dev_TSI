package lv.tsi.producer_consumer;

public class ProducerConsumerMain {
    public static void main(String[] args) {
        Goods good = new Goods(20);
        Producer pro = new Producer(good);
        pro.run();
        Consumer con = new Consumer(good);
        con.run();
    }
}