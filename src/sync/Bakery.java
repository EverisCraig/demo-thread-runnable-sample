package sync;

public class Bakery {
    private String pan;
    private boolean available;

    public synchronized void baking(String mass){
        while(available){
            try{
                wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        this.pan=mass;
        System.out.println("Baker baking : " + this.pan);
        this.available=true;
        notify();
    }

    public synchronized void consume(){
        while(!available){
            try{
                wait();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Client consume: " + this.pan);
        this.available=false;
        notify();

    }
}
