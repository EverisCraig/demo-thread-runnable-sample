package sync;

import java.util.concurrent.ThreadLocalRandom;

public class Baker implements Runnable{

    private final Bakery bakery;


    public Baker(Bakery bakery) {
        this.bakery = bakery;
    }

    @Override
    public void run() {
        for (int i=0; i<10; i++){
            bakery.baking("Pan n°: "+ i);
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
