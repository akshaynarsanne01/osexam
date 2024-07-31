public class Fibonacci {
    public static int fibonacci(int i) {
        if (i <= 1) {
            return i;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " numbers:");
        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}