class SumSquare {

    static void squaresSummed(String[] arguments) {
        int numIn;
        int squaresSum = 0;
        int sumsSquare = 0;
        int diff;

        if (arguments.length > 0) {
            numIn = Integer.parseInt(arguments[0]);
        } else numIn = 100;

        for (int i = 1; i <= numIn; i++){
            squaresSum += i*i;
            sumsSquare += i;
        }
        sumsSquare *= sumsSquare;

        diff = sumsSquare - squaresSum;

        System.out.println("The difference is: " + diff);
    }

 
    public static void main(String[] arguments) {
        squaresSummed(arguments);
    }
}