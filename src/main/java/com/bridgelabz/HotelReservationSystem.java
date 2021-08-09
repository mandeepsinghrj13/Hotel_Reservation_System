package com.bridgelabz;

/**
 * @author mandeep
 * creating HotelReservationSystem class
 */
public class HotelReservationSystem {
    /**
     * declaring variable
     */
    private String name;
    private  double weekDayRegularRate;
    private double weekDayRewardRate;

    /**
     * taking getter and setter
     * @param name
     */
    public HotelReservationSystem(String name) {
        this.name = name;
    }
    public double getWeekDayRegularRate() {
        return weekDayRegularRate;
    }
    public void setWeekDayRegularRate(double weekDayRegularRate) {
        this.weekDayRegularRate = weekDayRegularRate;
    }
    public double getWeekDayRewardRate() {
        return weekDayRewardRate;
    }

    public void setWeekDayRewardRate(double weekDayRewardRate) {
        this.weekDayRewardRate = weekDayRewardRate;
    }

}
