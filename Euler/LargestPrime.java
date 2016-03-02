import java.lang.Math;
import java.text.DecimalFormat;

class LargestPrime {

    public static void main(String [] arguments) {
        final long startTime = System.nanoTime();
        long num = 600851475143L;
        long currentLargest = 2;

        while (num > currentLargest) {
            if (num % currentLargest == 0) {
                num = num / currentLargest;
            } else {
                currentLargest += 1;
            }
            //System.out.println("Current largest factor is: " + currentLargest);
        }

        System.out.println("Current largest factor is: " + currentLargest);
       
    final long endTime = System.nanoTime();
    DecimalFormat df = new DecimalFormat("#");
    df.setMaximumFractionDigits(8);
    System.out.printf("Total execution time: " + df.format((endTime - startTime)*1e-9) + "s" );
    }
}
