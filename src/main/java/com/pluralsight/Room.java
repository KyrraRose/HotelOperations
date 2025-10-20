package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied,dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    /** public Room(int numberOfBeds, boolean occupied, boolean dirty) {
        this.numberOfBeds = numberOfBeds;
        switch (numberOfBeds){
            case 1:
                this.price = 139;
                break;
            case 2:
                this.price = 124;
                break;
        }
        this.occupied = occupied;
        this.dirty = dirty;
    }**/


    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return occupied;
    }


    public boolean isDirty() {
        return dirty;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public boolean isAvailable() {
        return (!dirty&&!occupied);
    }

}
