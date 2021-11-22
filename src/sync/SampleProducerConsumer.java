package sync;

public class SampleProducerConsumer {
    public static void main(String[] args) {
        Bakery bakery = new Bakery();
        new Thread(new Baker(bakery)).start();
        new Thread(new Client(bakery)).start();

    }
}
