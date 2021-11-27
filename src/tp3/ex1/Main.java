package tp3.ex1;

import java.lang.Thread;

public class Main {

    public static void main(String[] args) {

        ChildThread thread1 = new ChildThread();
        Thread thread2 = new Thread(new RunnableThread());
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            thread1.interrupt();
            e.printStackTrace();
        }
        thread2.start();
        try {

            thread2.join();
        } catch (InterruptedException e) {
            thread2.interrupt();
            e.printStackTrace();
        }
        System.out.println("it's over");

    }
}
