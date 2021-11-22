package medium;

 class Helper implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println("");
            Thread.sleep(5000);
        } catch (InterruptedException e) {

            System.out.println("");
        }
    }
}
