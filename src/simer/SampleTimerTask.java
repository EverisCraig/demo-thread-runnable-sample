package simer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class SampleTimerTask {
    public static void main(String[] args) {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {

            @Override
            public void run() {
                System.out.println("Task success in: " + new Date() + "thread name: " + Thread.currentThread().getName());
                System.out.println("Time finish");
                timer.cancel();
            }
        }, 5000);
        System.out.println("add task to 5 seconds....");
    }
}
