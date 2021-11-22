import basic.Cashier;
import basic.Client;

public class NoThreadMainMethod {
    public static void main(String[] args) {
        Client client1=new Client("basic.Client 1", new int[] {2,2,1,5,2,3});
        Client client2= new Client("basic.Client 2", new int[]{1,3,5,1,1});

        Cashier cashier1=new Cashier("basic.Cashier 1");
        Cashier cashier2=new Cashier("basic.Cashier 2");

        long initialTime=System.currentTimeMillis();

        cashier1.buyProcess(client1,initialTime);
        cashier2.buyProcess(client2, initialTime);
    }
}
