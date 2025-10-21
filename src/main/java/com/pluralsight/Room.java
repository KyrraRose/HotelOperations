package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean occupied,dirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        //defaulting rooms to be ready for check-in
        this.occupied = false;
        this.dirty = false;
    }


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

    public boolean isAvailable() {
        return (!dirty&&!occupied);
    }

    public void cleanRoom(){
        this.dirty = false;
    }
    public void checkIn(){
        this.occupied = true;
        this.dirty = true;
    }
    public void  checkOut(){
        this.occupied = false;
    }


}
