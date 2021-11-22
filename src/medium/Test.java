package medium;

public class Test implements Runnable {
    @Override
    public void run() {

    }

    public static void main(String[] args) throws InterruptedException {
        Test obj = new Test();
        Helper obj2 = new Helper();

        Thread thread1 = new Thread(obj);
        Thread thread2 = new Thread(obj2);

        thread1.start();
        thread2.start();

        ClassLoader loader = thread1.getContextClassLoader();

        Thread thread3 = new Thread(new Helper());

        System.out.println(Thread.activeCount());
        thread1.checkAccess();

        Thread thread4 = Thread.currentThread();

        System.out.println(thread4.getName());

        System.out.println("Thread1 name: " + thread1.getName());
        System.out.println("Thread1 ID: " + thread1.getId());

        System.out.println("Priority of thread1: " + thread1.getPriority());

        System.out.println(thread1.getState());

        thread2 = new Thread(obj2);
        thread2.start();
        thread2.interrupt();
        System.out.println("Is thread2 interrupted? " + thread2.isInterrupted());
        System.out.println("Is thread2 alive? " + thread2.isAlive());

        thread1 = new Thread(obj);
        thread1.setDaemon(true);
        System.out.println("Is thread1 a daemon thread?  " + thread1.isDaemon());
        System.out.println("Is thread1 interrupted? " + thread2.isInterrupted());

        System.out.println("Thread1 waiting for thread2 to join?");

        thread1.setName("child thread xyz");
        System.out.println("New name set for thread 1 " + thread1.getName());

        thread1.setPriority(5);
        thread2.join();

        System.out.println(thread1.toString());

        Thread[] threadArray = new Thread[3];

        Thread.enumerate(threadArray);

        System.out.println("List of active threads");
        System.out.println("[");

        for (Thread thread : threadArray) {
            System.out.println(thread);
        }
        System.out.println("]\n");

        System.out.println(Thread.getAllStackTraces());

        ClassLoader classLoader = thread1.getContextClassLoader();
        System.out.println(classLoader.toString());
        System.out.println(Thread.getDefaultUncaughtExceptionHandler());

        thread2.setUncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler());
        thread1.setContextClassLoader(thread2.getContextClassLoader());
        Thread.setDefaultUncaughtExceptionHandler(thread2.getUncaughtExceptionHandler());

        thread1 = new Thread(obj);
        StackTraceElement[] trace = thread1.getStackTrace();

        System.out.println("Printing stack trace elements for thread1:");

        for (StackTraceElement e : trace) {
            System.out.println(e);
        }

        ThreadGroup grp = thread1.getThreadGroup();
        System.out.println("ThreadGroup to which thread1 belongs " + grp.toString());
        System.out.println(thread1.getUncaughtExceptionHandler());
        System.out.println("Does thread1 holds Lock? " + Thread.holdsLock(obj2));






    }
}
