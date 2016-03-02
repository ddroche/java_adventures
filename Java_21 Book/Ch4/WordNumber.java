class WordNumber {
    public static void main(String[] arguments) {
        //accept arguments for word to be converted to number
        //if no argument given, default word is "zero"
        String numberIn;
        if (arguments.length > 0)
            numberIn = arguments[0].toLowerCase();
        else numberIn = "zero";

        System.out.println(numberIn + " as a digit is: " + longConverter(numberIn));
    }    

    static long longConverter(String num) {
        long digit = -1;
        switch (num) {
            case "zero":
                digit = 0L;
                break;
            case "one":
                digit = 1L;
                break;
            case "two":
                digit = 2L;
                break;
            case "three":
                digit = 3L;
                break;
            case "four":
                digit = 4L;
                break;
            case "five":
                digit = 5L;
                break;
            case "six":
                digit = 6L;
                break;
            case "seven":
                digit = 7L;
                break;
            case "eight":
                digit = 8L;
                break;
            case "nine":
                digit = 9L;
                break;
            case "ten":
                digit = 10L;
                break;
            default:
                System.out.println("ERROR: Word not recognized");
        }
        return digit;
    }
}