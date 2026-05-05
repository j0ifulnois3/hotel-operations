package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    public String getRoomType() { return roomType; }
    public void setRoomType(String roomType) { this.roomType = roomType; }

    public int getNumberOfNights() { return numberOfNights; }
    public void setNumberOfNights(int numberOfNights) { this.numberOfNights = numberOfNights; }

    public boolean isWeekend() { return weekend; }
    public void setIsWeekend(boolean weekend) { this.weekend = weekend; }

    // Derived Getter: Logic for pricing
    public double getPrice() {
        double basePrice = roomType.equalsIgnoreCase("king") ? 139.00 : 124.00;
        if (weekend) {
            basePrice = basePrice * 1.10; // 10% increase
        }
        return basePrice;
    }

    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }



}
