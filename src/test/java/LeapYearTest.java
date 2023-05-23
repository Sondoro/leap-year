import ke.co.safaricom.LeapYear;
import org.junit.*;
import org.junit.jupiter.api.Test;

public class LeapYearTest {
    @Test
   public void isLeapYear_forNumberDivisibleByFour_true() {
        LeapYear leapYear = new LeapYear();
        assertEquals(true, leapYear.isLeapYear(2012));
    }

    private void assertEquals(boolean b, boolean leapYear) {

    }
}
