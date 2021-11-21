public class SampleUsingRunnable implements Runnable{

    @Override
    public void run() {
        System.out.println("Thread is created using Runnable interface");
    }

    public static void main(String[] args) {
        SampleUsingRunnable usingRunnable=new SampleUsingRunnable();
        Thread myThread=new Thread(usingRunnable);
        myThread.start();
    }
}
