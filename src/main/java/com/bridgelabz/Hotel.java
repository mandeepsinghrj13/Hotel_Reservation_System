package com.bridgelabz;

/**
 * @author mandeep
 * creating hotal class and main class
 */
public class Hotel {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel reservation system");//welcome message
/**
 * adding rate for hotel each a every hotel name
 */
        HotelReservationSystem lakewood = new HotelReservationSystem("lakewood");
        lakewood.setWeekDayRegularRate(110);
        lakewood.setWeekDayRewardRate(80);

        HotelReservationSystem Bridgewood = new HotelReservationSystem("Bridgewood");
        Bridgewood.setWeekDayRegularRate(160);
        Bridgewood.setWeekDayRewardRate(110);

        HotelReservationSystem Ridgewood = new HotelReservationSystem("Ridgewood");
        Ridgewood.setWeekDayRegularRate(220);
        Ridgewood.setWeekDayRewardRate(100);
    }
}
