package basic;

public class SampleSynchronization {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new PrintPhrase("Hi", "wsp bro")).start();
        new Thread(new PrintPhrase("¿How are", " you?")).start();
        Thread.sleep(100);
        Thread thread3= new Thread(new PrintPhrase("Thanks", "friend"));
        thread3.start();
        Thread.sleep(100);
        System.out.println(thread3.getState());
    }

    public synchronized static void printPhrase(String phrase1, String phrase2) {
        System.out.println(phrase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(phrase2);
    }
}
