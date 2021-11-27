package tp3.ex3;

public class Main {

    public static void main(String[] args) {
        final Actions actions = new Actions();
        Student student = new Student("Salah", actions);
        Vendor vendor = new Vendor("El Baya3", actions);
        student.start();
        vendor.start();

        // output should be :
        // Student Salah is waiting for a sandwich
        // Vendor El Baya3 said 'isi sandwich is ready'
        // Student Salah got a sandwich
        // Vendor got his money
    }
}
