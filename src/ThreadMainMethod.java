public class ThreadMainMethod extends Thread{
    public static void main(String[] args) {

        Client client1=new Client("Client 1: ", new int []{2,2,1,5,2,3});
        Client client2=new Client("Client 2: ",new int []{1,3,5,1,1});

        long initialTime=System.currentTimeMillis();
        CashierThread cashier1= new CashierThread("Cashier 1: ", client1, initialTime);
        CashierThread cashier2= new CashierThread("Cashier 2: ", client2, initialTime);

        cashier1.start();
        cashier2.start();


    }
}
