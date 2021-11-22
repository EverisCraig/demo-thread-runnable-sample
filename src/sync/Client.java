package sync;

import java.util.concurrent.ThreadLocalRandom;

public class Client implements Runnable{

    private final Bakery bakery;

    public Client(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            bakery.consume();
        }
    }
}
