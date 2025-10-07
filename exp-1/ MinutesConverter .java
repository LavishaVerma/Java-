class MinutesConverter {
    public static void main(String[] args) {
        
        System.out.println("name: Lavisha Verma\n");

        long minutes = 525600; //  minutes in 1 yr 

        // minutes into days
        long days = minutes / (60 * 24);

        //days into years, months, and remaining days
        long years = days / 365;
        long remainingDaysAfterYears = days % 365;
        long months = remainingDaysAfterYears / 30; // approx 30 days in a month
        long remainingDays = remainingDaysAfterYears % 30;

        // Print the result
        System.out.println(minutes + " minutes is approximately:");
        System.out.println(years + " years, " + months + " months, and " + remainingDays + " days.");
    }
}
