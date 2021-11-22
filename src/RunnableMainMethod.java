import basic.Cashier;
import basic.Client;

public class RunnableMainMethod implements Runnable{
    private Client client;
    private Cashier cashier;
    private long initialTime;

    public RunnableMainMethod(Client client, Cashier cashier, long initialTime) {
        this.client = client;
        this.cashier = cashier;
        this.initialTime = initialTime;
    }

    public static void main(String[] args) {
        Client client1 = new Client("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
        Client client2 = new Client("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

        Cashier cashier1 = new Cashier("Cajera 1");
        Cashier cashier2 = new Cashier("Cajera 2");

        // Tiempo inicial de referencia
        long initialTime = System.currentTimeMillis();

        Runnable proceso1 = new RunnableMainMethod(client1, cashier1, initialTime);
        Runnable proceso2 = new RunnableMainMethod(client2, cashier2, initialTime);

        new Thread(proceso1).start();
        new Thread(proceso2).start();
    }

    @Override
    public void run() {
        this.cashier.buyProcess(this.client, this.initialTime);
    }
}
