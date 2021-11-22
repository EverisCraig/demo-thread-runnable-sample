package basic;

public class CashierThread extends Thread{
    private String nameCashier;
    private Client client;
    private long initialTime;

    public CashierThread(String name, Client client, long initialTime) {
        this.nameCashier = name;
        this.client = client;
        this.initialTime = initialTime;
    }

    public String getNameCashier() {
        return nameCashier;
    }

    public void setNameCashier(String nameCashier) {
        this.nameCashier = nameCashier;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public long getInitialTime() {
        return initialTime;
    }

    public void setInitialTime(long initialTime) {
        this.initialTime = initialTime;
    }

    @Override
    public void run() {
        System.out.println("La cajera " + this.nameCashier + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE "
                + this.client.getName()+ " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");

        for (int i = 0; i < this.client.getShoppingCart().length; i++) {
            this.waitForSecond(client.getShoppingCart()[i]);
            System.out.println("Procesado el producto " + (i + 1)
                    + " del cliente " + this.client.getName() + "->Tiempo: "
                    + (System.currentTimeMillis() - this.initialTime) / 1000
                    + "seg");
        }

        System.out.println("La cajera " + this.nameCashier + " HA TERMINADO DE PROCESAR "
                + this.client.getName() + " EN EL TIEMPO: "
                + (System.currentTimeMillis() - this.initialTime) / 1000
                + "seg");
    }

    private void waitForSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }


}
