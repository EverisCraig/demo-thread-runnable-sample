public class Cashier {
    private String name;

    public Cashier(String name) {
        this.name = name;
    }

    public void buyProcess(Client client, long timestamp) {
        System.out.println(" This cashier " + this.name +
                " init tha buy process of the client " + client.getName() +
                " time: " + (System.currentTimeMillis() - timestamp) / 1000 +
                " seg");

        for (int i = 0; i < client.getShoppingCart().length; i++) {
            this.waitSeconds(client.getShoppingCart()[i]);
            System.out.println("Process the product " + (i + 1) +
                    " -> Time: " + (System.currentTimeMillis() - timestamp) / 1000 +
                    " seg");
        }
        System.out.println(" The cashier " + this.name +
                " has completed processing " + client.getName() +
                " Time: " + (System.currentTimeMillis() - timestamp) / 1000 +
                " seg");
    }

    private void waitSeconds(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
