import static org.junit.jupiter.api.Assertions.assertEquals;

import org.example.LeapYearFunction;
import org.junit.jupiter.api.Test;

public class TestLeapYearFunction {
    private LeapYearFunction year = new LeapYearFunction();

    @Test
    public void testYearDividesBy400()
    {
        assertEquals(1,year.checkLeapYear(2000));
        assertEquals(1,year.checkLeapYear(-1600));
        assertEquals(0,year.checkLeapYear(100));
    }

    @Test
    public void testYearDividesBy4()
    {
        assertEquals(1,year.checkLeapYear(2016));
        assertEquals(1,year.checkLeapYear(-20));
        assertEquals(0,year.checkLeapYear(3));
    }

    @Test
    public void testYearNotDividesBy100()
    {
        assertEquals(0,year.checkLeapYear(300));
        assertEquals(0,year.checkLeapYear(-100));
        assertEquals(1,year.checkLeapYear(2020));
    }

    @Test
    public void testYearNotDividesBy4000()
    {
        assertEquals(0,year.checkLeapYear(8000));
        assertEquals(0,year.checkLeapYear(-16000));
        assertEquals(1,year.checkLeapYear(2024));
    }
}
