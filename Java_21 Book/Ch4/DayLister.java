class DayLister {
    public static void main(String[] arguments) {
        //display every date in a given year in a single list from january 1 to december 31
        //assume that the year is 2014, unless an argument is given
        int year = 2014;
        //accept argument for year
        if (arguments.length > 0)
            year = Integer.parseInt(arguments[0]);

        //display year for reference
        System.out.print("Year: " + year + "\n");

        //loop through days
        for ( int month = 1; month <= 12; month++) {
            int numDays = DayCounter.countDays(month, year);
            for ( int day = 1; day <= numDays; day++) {
                System.out.println(month + "/" + day + "/" + year);
            }

        }
    }
}