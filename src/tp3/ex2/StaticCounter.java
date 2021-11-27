package tp3.ex2;

public class StaticCounter {
    private static int counter = 0;

    private StaticCounter() {
    }

    // todo : implement me
    public static void increment() {
        counter++;
        System.out.println(counter);
    }
}
