package com.hieudoan.parkingbills;

public class Main {
    public static void main(String[] args) {
        ParkingBills p1 = new ParkingBills();
        System.out.println("cost" + p1.solution("10:00", "13:21"));
        System.out.println("cost" + p1.solution("09:42", "11:42"));
        System.out.println("cost" + p1.solution("09:42", "09:43"));
    }
}
