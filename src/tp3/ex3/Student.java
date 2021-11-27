package tp3.ex3;

public class Student extends Thread {

    private Actions actions;

    public Student(String s, Actions actions) {
        super(s);
        this.actions = actions;
    }

    @Override
    public void run() {
        try {
            actions.studentAction(this.getName());
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}