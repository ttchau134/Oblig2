package org.example;

public class Main {
    public static void main(String[] args)
    {
        int year = 2120;

        if (LeapYearFunction.checkLeapYear(year)==1)
            System.out.printf("Year %d is a leap year\n", year);
        else
            System.out.printf("Year %d is not a leap year\n", year);
    }
}