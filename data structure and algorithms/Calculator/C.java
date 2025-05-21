public class C extends Thread {
    @Override
    public void run() {
        Calculator c = new Calculator();
        int res = c.Multiplication(2, 3);
        System.out.println("Multiplication result: " + res);
    }
}
