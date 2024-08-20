package week2;

public class fibonacci {
    private static long[] fibonacciCache;

    public static void main(String[] args) {

        int n = 10;

        fibonacciCache = new long[n + 1];

        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i) + " ");
        }
    }

    private static long fib(int n) {
        if (n <= 1) {
            return n;
        }

        if (fibonacciCache[n] != 0) {
            return fibonacciCache[n];
        }

        long nthFibonacciNumber = (fib(n - 1) + fib(n - 2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
