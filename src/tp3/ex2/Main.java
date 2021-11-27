package tp3.ex2;

public class Main {

    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();
        MyThread t1 = new MyThread(myCounter);
        MyThread t2 = new MyThread(myCounter);
        // first thread increments the count variable in Static counter
        // and then executes the count method of myCounter
        // after it finishes the second thread repeats the process
        try {
            t1.join();
        } catch (InterruptedException e) {
            t1.interrupt();
            e.printStackTrace();
        }
        t2.start();
    }
}
