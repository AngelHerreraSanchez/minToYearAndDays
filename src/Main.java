public class Main {
    public static void main(String[] args) {
        System.out.println(printYearsAndDays(525600));
        System.out.println(printYearsAndDays(1051200));
        System.out.println(printYearsAndDays(561600));
    }


    public static int printYearsAndDays(long minutes) {
        long hours = minutes / 60;
        long days = hours / 24;
        long years = days / 365;
        long leftoverDays = days % 365;
        if (minutes >= 0) {
            System.out.println(years + " y and " + leftoverDays + " d");
        } else {
            System.out.println("Invalid Value");
        }
        return 0;
    }



}
