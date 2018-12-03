package com.hieudoan.parkingbills;

public class ParkingBills {
    private static final Integer ENTRANCE_FEE = 2;
    private static final Integer FIRST_HOUR_COST = 3;
    private static final Integer COST_AFTER_FIRST_HOUR = 4;

    public  int solution(String startTime, String endTime) {
        int totalParkingHours = totalParkingHour(startTime, endTime);
        int costAfter1Hours = totalParkingHours > 1 ? (totalParkingHours - 1) * COST_AFTER_FIRST_HOUR : 0;
        return ENTRANCE_FEE + FIRST_HOUR_COST + costAfter1Hours;
    }

    private  int totalParkingHour(String startTime, String endTime) {
        String[] startTimeArr = startTime.split(":");
        String[] endTimeArr = endTime.split(":");
        int diffHour = Integer.parseInt(endTimeArr[0]) - Integer.parseInt(startTimeArr[0]);
        int diffMinutes = Integer.parseInt(endTimeArr[1]) - Integer.parseInt(startTimeArr[1]);
        if( diffMinutes > 0) {
            diffHour += 1;
        }
        return diffHour;
    }
}
