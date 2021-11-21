public class SampleUsingThread  extends Thread{
    @Override
    public void run() {
        System.out.println(
                "Thread is running created by extending to parent Thread class"
        );
    }

    public static void main(String[] args) {
        SampleUsingThread sampleUsingThread=new SampleUsingThread();
        sampleUsingThread.start();
    }
}
