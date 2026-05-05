package com.pluralsight;

public class Room {
    private int numberOfbeds;
      private double price;
      private boolean occupied;
      private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfbeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public int getNumberOfBeds() { return numberOfbeds; }
    public double getPrice() { return price; }
    public boolean isOccupied() { return occupied; }
    public boolean isDirty() { return dirty; }

    // Derived Getter: Only available if NOT occupied AND NOT dirty
    public boolean isAvailable() {
        return !this.occupied && !this.dirty;
    }
}

