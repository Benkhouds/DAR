package tp3.ex3;

public class Vendor extends Thread {

    private Actions actions;

    public Vendor(String s, Actions actions) {
        super(s);
        this.actions = actions;
    }

    @Override
    public void run() {
        try {
            sleep(2000);
            actions.vendorAction(this.getName());
        } catch (InterruptedException e) {
            this.interrupt();
            e.printStackTrace();
        }

    }
}
