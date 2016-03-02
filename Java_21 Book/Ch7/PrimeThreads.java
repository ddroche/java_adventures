import java.text.DecimalFormat;

public class PrimeThreads {
    public static void main(String[] arguments) {
        final long startTime = System.nanoTime();
        PrimeThreads pt = new PrimeThreads(arguments);
        final long endTime = System.nanoTime();
        DecimalFormat df = new DecimalFormat("#");
        df.setMaximumFractionDigits(8);
        System.out.printf("Total execution time: " + df.format((endTime - startTime)*1e-9) + "s" );
    }

    public PrimeThreads(String[] arguments) {
        PrimeFinder[] finder = new PrimeFinder[arguments.length];
        for (int i = 0; i < arguments.length; i ++) {
            try {
                long count = Long.parseLong(arguments[i]);
                finder[i] = new PrimeFinder(count);
                System.out.println("Looking for prime " + count);
            } catch (NumberFormatException nfe) {
                System.out.println("Error: " + nfe.getMessage());
            }
        }
        boolean complete = false;
        while (!complete) {
            complete = true;
            for (int j = 0; j < finder.length; j++) {
                if (finder[j] == null) continue;
                if (!finder[j].finished) {
                    complete = false;
                } else {
                    displayResult(finder[j]);
                    finder[j] = null;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                //do nothing
            }
        }
    }

    private void displayResult(PrimeFinder finder) {
        System.out.println("Prime " + finder.target + " is " + finder.prime);
    }
}