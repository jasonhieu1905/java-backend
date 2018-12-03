package com.hieudoan.parkingbills;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ParkingBillsTest {

    @Test
    public void testLessThan1HourParking() {
        ParkingBills p = new ParkingBills();
        assertEquals(5, p.solution("09:40", "09:58"));
    }

    @Test
    public void test2HoursParking() {
        ParkingBills p = new ParkingBills();
        assertEquals(9, p.solution("09:40", "10:58"));
    }

    @Test
    public void testMoreThan2HoursParking() {
        ParkingBills p = new ParkingBills();
        assertEquals(13, p.solution("09:40", "11:58"));
    }
}
