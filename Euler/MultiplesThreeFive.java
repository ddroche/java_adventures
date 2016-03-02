class MultiplesThreeFive {

    public static void main(String[] arguments) {
        int sum = 0;
        int upperBound = 1000;

        if (arguments.length > 0)
            upperBound = Integer.parseInt(arguments[0]);

        for (int i = 0; i < upperBound; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                sum += i;
        }
        System.out.println("The sum of multiples of 3 and 5 less than " + upperBound + " is " + sum + ".");
    }
}
