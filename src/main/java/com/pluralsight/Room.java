package com.pluralsight;

public class Room {
    private int numberOfbeds;
      private double price;
      private boolean isOccupied;
      private boolean isDirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfbeds = numberOfBeds;
        this.price = price;
        this.isOccupied = occupied;
        this.isDirty = dirty;
    }

    public int getNumberOfBeds() { return numberOfbeds; }
    public double getPrice() { return price; }
    public boolean isOccupied() { return isOccupied; }
    public boolean isDirty() { return isDirty; }

    // Derived Getter: Only available if NOT occupied AND NOT dirty
    public boolean isAvailable() {
        return !this.isOccupied && !this.isDirty;
    }

    @Override
    public String toString() {
        return "Room{" +
                "numberOfbeds=" + numberOfbeds +
                ", price=" + price +
                ", isOccupied=" + isOccupied +
                ", isDirty=" + isDirty +
                '}';
    }
}

