import java.text.DecimalFormat;

//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

//Need to test for following numbers {2, 3, 5, 7, 11, 13, 17, 19}
//{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20}
// {5, 7, 9, 12, 24}

class SmallestMultiple {
    

    static void smallestMultiple() {
        int[] testNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int possNum = 1;
        boolean temp = true;

        while (temp) {
            // System.out.println("+++++++++++++++++++++++++");
            for (int i = 0; i < testNums.length; i++) {
                if ( possNum % testNums[i] == 0) {
                    temp = false;
                } else {
                    temp = true;
                    break;
                }
                // System.out.println("---------");
                // System.out.println("testNum[" + i + "] = " + testNums[i]);
                // System.out.println("possNum = " + possNum);
                // System.out.println(!temp);
            }
            possNum++;
            //System.out.println(possNum);
        } 
        // account for possNum initially being 1 and not 0
        possNum -= 1;
        System.out.println("The smallest positive number evenly \ndivisible by all numbers from 1 to 20 is: " + possNum);
    }

    public static void main(String[] arguments) {
        final long startTime = System.nanoTime();
        smallestMultiple();
        final long endTime = System.nanoTime();
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        System.out.printf("Total execution time: " + df.format((endTime - startTime)*1e-9) + "s" );
    }
}