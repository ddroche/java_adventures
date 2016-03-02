class EvenFibonacci {


    public static void main(String[] arguments) {
        long sum = 2;
        long[] fib = new long[100];

        fib[0] = 1;
        fib[1] = 2;

        for (int i = 2; i < 50; i++) {
            fib[i] = fib[i-1] + fib[i-2];
            System.out.println(fib[i]);
            if (fib[i] % 2 == 0 && fib[i] < 4000000) {
                sum += fib[i];
            }
        }

        System.out.println("The sum of even Fibonacci numbers under 4,000,000 is: " + sum);
    }
}