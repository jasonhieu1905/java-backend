package com.hieudoan.parkingbills;

import com.hieudoan.publictransport.PublicTransport;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PublicTransportTest {

    @Test
    public void testOneDayWhenFirstDayOfMonth() {
        PublicTransport p = new PublicTransport();
        assertEquals(2,p.solution(new int[]{1}));
    }

    @Test
    public void testOneDayWhenMiddleDayOfMonth() {
        PublicTransport p = new PublicTransport();
        assertEquals(2,p.solution(new int[]{15}));
    }

    @Test
    public void testOneDayWhenEndOfMonth() {
        PublicTransport p = new PublicTransport();
        assertEquals(2,p.solution(new int[]{30}));
    }

    @Test
    public void test2Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(4,p.solution(new int[]{10,11}));
    }

    @Test
    public void test3Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(6,p.solution(new int[]{10,11, 12}));
    }

    @Test
    public void testInRange7Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(7,p.solution(new int[]{10,12,14, 16}));
    }

    @Test
    public void testOutRange7Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(8,p.solution(new int[]{10,12,14, 17}));
    }

    @Test
    public void testHas2TypesOfTickets() {
        PublicTransport p = new PublicTransport();
        assertEquals(11,p.solution(new int[]{1,2,4, 5, 7, 29, 30}));
    }

    @Test
    public void test3Tickets7Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(21,p.solution(new int[]{1, 2, 3, 4, 10, 11, 12, 13, 20, 21,22, 23}));
    }

    @Test
    public void test1Ticket30Days() {
        PublicTransport p = new PublicTransport();
        assertEquals(25,p.solution(new int[]{1, 2, 3, 4, 10, 11, 12, 13, 20, 21,22, 23, 29, 30}));
    }

}
