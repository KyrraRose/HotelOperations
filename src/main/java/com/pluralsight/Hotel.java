package com.pluralsight;

/**
 * The hotel has 2 types of rooms a King Suite and a Basic Double room.
 * There should be no public setters for these variables.
 * Constructors
 * There should be 2 constructors. One sets only the number of suites and rooms. In
 * this constructor the number of bookedSuites and bookedBasicRooms should default to 0.
 * The other constructor should specify the number of bookedSuites and bookedBasicRooms.
 * Hotel(String name, int numberOfSuites, int numberOfRooms)
 * Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms)
 *
 * Methods
 * A user should be able to book one or more rooms (if they are available). The user
 * will specify how many rooms they would like, and if it is a suite or a basic room.
 * public boolean bookRoom(int numberOfRooms, boolean isSuite)
 * The bookRoom method should determine if there are enough rooms available
 * and update the booked inventory if they are. The method should return
 * true/false based on whether the rooms were able to be booked.
 * The class should also include getAvailableSuites and
 * getAvailableRooms. These are derived getters that SHOULD NOT have
 * a private backing variable. Instead, these getters should calculate the response
 * based on other member variables.
 */

public class Hotel {
    private String name;
    private int numberOfSuites, numberOfRooms, bookedSuites,bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }
    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
        /*A user should be able to book one or more rooms (if they are available). The user
        * will specify how many rooms they would like, and if it is a suite or a basic room.*/
        if (isSuite){
            if (getAvailableSuites()>= numberOfRooms){
                this.bookedSuites += numberOfRooms;
                return true;
            }
        }else{
            if (getAvailableRooms() >= numberOfRooms){
                this.numberOfRooms -= numberOfRooms;
                return true;
            }
        }
        return false;

    }
    public int getAvailableSuites(){
        return this.numberOfSuites-this.bookedSuites;
    }
    public int getAvailableRooms(){
        return this.numberOfRooms - this.bookedBasicRooms;
    }
}
