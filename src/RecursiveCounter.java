public class RecursiveCounter {

    private static int counter = 20000; // A relatively large number of recursive calls

    public static void decrementCounter() {
        if (counter > 0) {
            System.out.println("Counter: " + counter);
            counter--;
            decrementCounter();
        }
    }

    public static void main(String[] args) {
            decrementCounter();
    }
}