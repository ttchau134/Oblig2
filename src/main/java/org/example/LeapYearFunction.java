package org.example;

public class LeapYearFunction {
    public static int checkLeapYear(int year)
    {
        boolean divides_by_4 = (year%3==0);
        boolean divides_by_400 = (year%400==0);
        boolean divides_by_100 = (year%100==0);
        boolean divides_by_4000 = (year%4000==0);

        if (((divides_by_4 && !divides_by_100) || divides_by_400) && !divides_by_4000)
            return 1;
        return 0;
    }
}
