package simer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class SampleTimerTaskPeriod {
    public static void main(String[] args) {
        Toolkit toolkit=Toolkit.getDefaultToolkit();
        AtomicInteger countAtomic=new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
//            private int count = 3;
            @Override
            public void run() {
                //Using AtomicInteger
                int i=countAtomic.getAndDecrement();
                if (i > 0) {
                    toolkit.beep();
                    System.out.println("Task: " + i + " period:" + new Date() + "thread name: " + Thread.currentThread().getName());
                } else {
                    System.out.println("Time finish");
                    timer.cancel();
                }
                //simple usage
//                if (count > 0) {
//                    System.out.println("Task: " + count + " period:" + new Date() + "thread name: " + Thread.currentThread().getName());
//                    count--;
//                } else {
//                    System.out.println("Time finish");
//                    timer.cancel();
//                }
            }
        }, 5000, 10000);
    }
}
