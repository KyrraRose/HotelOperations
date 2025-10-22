package com.pluralsight;

import static org.junit.jupiter.api.Assertions.*;
class RoomTest {

    @org.junit.jupiter.api.Test

    void checkIn_OccupiedAndDirty_True() {
        //arrange
        Room roomTest = new Room(0,0);
        //act
        roomTest.checkIn();
        //assert
        assertTrue(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
        assertFalse(roomTest.isAvailable());

    }

    @org.junit.jupiter.api.Test
    void checkOut_UnoccupiedandDirty_True() {
        //arrange
        Room roomTest = new Room(0,0);
        //act
        roomTest.checkIn();
        roomTest.checkOut();
        //assert
        assertFalse(roomTest.isOccupied());
        assertTrue(roomTest.isDirty());
        assertFalse(roomTest.isAvailable());

    }
    @org.junit.jupiter.api.Test
    void cleanRoom_CleanandMakeAvailable_True() {
        //arrange
        Room roomTest = new Room(0,0);
        //act
        roomTest.checkIn();
        roomTest.checkOut();
        roomTest.cleanRoom();
        //assert
        assertFalse(roomTest.isOccupied());
        assertFalse(roomTest.isDirty());
        assertTrue(roomTest.isAvailable());

    }
}