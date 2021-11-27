package tp3.ex3;

public class Actions extends ISISandwich {

  public synchronized void studentAction(String name) throws InterruptedException {

    while (!this.isReady()) {
      System.out.println("Student " + name + " is waiting for a sandwich");
      wait(1000);
    }

    System.out.println("Student " + name + " got a sandwich");

    while (!this.isPaid()) {
      wait(2000);
      this.setIsPaid(true);
    }
    notifyAll();
  }

  public synchronized void vendorAction(String name) throws InterruptedException {
    if (!this.isReady()) {
      this.setReady(true);
      System.out.println("Vendor " + name + " said 'isi sandwich is ready'");
      notifyAll();
    }
    while (!this.isPaid()) {
      wait();
      System.out.println("Vendor got his money\nProcess finished");
    }

  }
}
