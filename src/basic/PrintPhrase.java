package basic;

public class PrintPhrase implements Runnable {

    private String phrase1, phrase2;

    public PrintPhrase(String phrase1, String phrase2) {
        this.phrase1 = phrase1;
        this.phrase2 = phrase2;
    }

    @Override
    public void run() {
        SampleSynchronization.printPhrase(this.phrase1, this.phrase2);
    }
}
