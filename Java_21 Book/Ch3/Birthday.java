class Birthday {
    public static void main(String[] arguments) {
        String birthday = "02/27/1988";
        String month = birthday.substring(0,2);
        String day = birthday.substring(3,5);
        String year = birthday.substring(6,10);
        
        System.out.println("Birthday: " + birthday);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Year: " + year);
    }
}