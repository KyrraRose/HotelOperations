package com.pluralsight;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
   private String employeeId, name, department;
   private double payRate, hoursWorked, clockIn,clockOut;

    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }



    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    private double getRegularHours(){
        if (hoursWorked >= 40){
            return 40;
        }else{
            return hoursWorked;
        }

    }
    private double getOvertimeHours(){
        if (hoursWorked > 40){
            return hoursWorked-40;
        }else{
            return 0;
        }
    }

    public double getTotalPay(){
        return (getRegularHours()*payRate)+(getOvertimeHours()*(payRate*1.5));
    }

    public void clockInOut(double timePunch){
        if(this.clockIn == 0){
            this.clockIn = timePunch;
        }else {
            this.clockOut = timePunch;
            this.hoursWorked += Math.abs(this.clockIn -this.clockOut);
            this.clockIn = 0;
            this.clockOut = 0;
        }
    }
    public void clockInOut(){
        DateTimeFormatter hourFormat = DateTimeFormatter.ofPattern("H");
        DateTimeFormatter minuteFormat = DateTimeFormatter.ofPattern("mm");
        if(this.clockIn == 0){
             double minutes = LocalTime.now().getMinute();
             double hour = LocalTime.now().getHour();
             this.clockIn = hour + (minutes/60);
        }else {
            double minutes = LocalTime.now().plusMinutes(30).getMinute();
            double hour = LocalTime.now().plusHours(12).getHour();
            //adding 12 hours 30 mins here to test the clock in/out
            this.clockOut = hour + (minutes/60);
            this.hoursWorked += Math.abs(this.clockIn - this.clockOut);
            this.clockIn = 0;
            this.clockOut = 0;
        }
    }
    public double getHoursWorked() {
        return hoursWorked;
    }

}
