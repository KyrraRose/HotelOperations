package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {


        Reservation vip = new Reservation("king",2,false);
        System.out.printf("\nReserving a %s room for %d nights is $%.2f",vip.getRoomType(),vip.getNumberOfNights(),vip.getReservationTotal());
        Reservation regular = new Reservation("double",2,true);
        System.out.printf("\nReserving a %s room for %d nights on the weekend is $%.2f",regular.getRoomType(),regular.getNumberOfNights(),regular.getReservationTotal());
        System.out.println();

        Room standard1 = new Room(2,regular.getPrice());
        Room standard2 = new Room(2,regular.getPrice());
        Room honeymoon = new Room(1,vip.getPrice());
        Room executive = new Room(1,vip.getPrice());

        standard1.checkIn();
        standard2.checkIn();
        honeymoon.checkIn();
        executive.checkIn();

        System.out.println("Is standard room 1 available: "+standard1.isAvailable());
        standard1.checkOut();
        System.out.println("Is standard room 1 available: "+standard1.isAvailable());
        standard1.cleanRoom();
        System.out.println("Is standard room 1 available: "+standard1.isAvailable());

        Employee linda = new Employee("124h","Linda Barnes","Concierge",15.00);
        linda.clockIn(10.35);
        linda.clockOut(14.00);
        System.out.printf("%s worked %.2f hours in %s, earning $%.2f",linda.getName(),linda.getHoursWorked(),linda.getDepartment(),linda.getTotalPay());
        System.out.println();

    }
}
