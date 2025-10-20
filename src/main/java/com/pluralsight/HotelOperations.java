package com.pluralsight;

public class HotelOperations {
    public static void main(String[] args) {
        Room standard1 = new Room(2,124,true,true);
        Room standard2 = new Room(2,124,false,false);
        Room honeymoon = new Room(1,139,false,true);
        Room executive = new Room(1,139,false,false);

        System.out.println("Standard Room 1 is available: "+standard1.isAvailable());
        System.out.println("Standard Room 2 is available: "+standard2.isAvailable());
        System.out.println("Honeymoon Suite is available: "+honeymoon.isAvailable());
        System.out.println("Executive Suite is available: "+executive.isAvailable());

        Reservation vip = new Reservation("king",139,3,false);
        System.out.printf("\nReserving a %s room for %d nights is $%.2f",vip.getRoomType(),vip.getNumberOfNights(),vip.getReservationTotal());
        Reservation regular = new Reservation("double",124,2,true);
        System.out.printf("\nReserving a %s room for %d nights on the weekend is $%.2f",regular.getRoomType(),regular.getNumberOfNights(),regular.getReservationTotal());
        System.out.println();
        Employee linda = new Employee("124h","Linda Barnes","Concierge",15.00,46);
        System.out.printf("%s worked %.2f hours in %s, earning $%.2f",linda.getName(),linda.getHoursWorked(),linda.getDepartment(),linda.getTotalPay());
    }
}
