package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {


        Reservation vip = new Reservation("king",2,false);
        System.out.printf("\nReserving a %s room for %d nights is $%.2f",vip.getRoomType(),vip.getNumberOfNights(),vip.getReservationTotal());
        Reservation regular = new Reservation("double",2,true);
        System.out.printf("\nReserving a %s room for %d nights on the weekend is $%.2f",regular.getRoomType(),regular.getNumberOfNights(),regular.getReservationTotal());
        System.out.println();

        Room standard1 = new Room(2,regular.getPrice());


        standard1.checkIn();

        System.out.println("Is standard room 1 available: "+standard1.isAvailable());
        standard1.checkOut();
        System.out.println("Is standard room 1 available: "+standard1.isAvailable());
        standard1.cleanRoom();
        System.out.println("Is standard room 1 available: "+standard1.isAvailable());

        Employee linda = new Employee("124h","Linda Barnes","Guest Services",15.00);
        linda.clockInOut(11.50,20);
        //testing adding more hours, a second shift if you will
        linda.clockInOut(9,19);
        System.out.printf("%s worked %.2f hours in %s, earning $%.2f",linda.getName(),linda.getHoursWorked(),linda.getDepartment(),linda.getTotalPay());
        System.out.println();

    }
}
