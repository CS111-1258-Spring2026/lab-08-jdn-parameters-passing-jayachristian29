// PARTNER NAME: Jaya Eckert
// PARTNER NAME: 
// CS111 SECTION #: 
// DATE:
// YOUR NAME:
// COLLABORATORS:
// DATE:

public class Main {

    public static void main(String[] args) {

        // Katherine Johnson birthday test
        int julianDate1 = calcJulianDate(8, 26, 1918);
        System.out.println("Julian Date for 8/26/1918: " + julianDate1);

        // Additional examples
        int julianDate2 = calcJulianDate(7, 20, 1969); // Moon landing
        System.out.println("Julian Date for 7/20/1969: " + julianDate2);

        int julianDate3 = calcJulianDate(1, 1, 2000); // Example date
        System.out.println("Julian Date for 1/1/2000: " + julianDate3);

    }

    /**
     * Calculates the Julian Day Number for a given calendar date.
     *
     * Description:
     * This method converts a Gregorian calendar date into a Julian Day Number.
     *
     * Preconditions: 1) monthToday must be between 1 and 12 2) dayToday must be a valid day of the month 3) yearToday must be a valid Gregorian year
     *
     * Postconditions: Returns the Julian Day Number corresponding to the given date.
     *
     * @param monthToday month of the date
     * @param dayToday day of the date
     * @param yearToday year of the date
     * 
     * @return Julian Day Number as an integer
     * @author Jaya Eckert <jayachristianlopez@gmail.com>
     */
    
    public static int calcJulianDate(int monthToday, int dayToday, int yearToday) {

        int a = (14 - monthToday) / 12;
        int y = yearToday + 4800 - a;
        int m = monthToday + 12 * a - 3;

        int jdn = dayToday + (153 * m + 2) / 5 + 365 * y
                + y / 4 - y / 100 + y / 400 - 32045;

        return jdn;
    }
}
