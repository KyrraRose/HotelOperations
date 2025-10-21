package com.pluralsight;

public class Employee {
   private String employeeId, name, department;
   private double payRate, hoursWorked, clockIn,clockOut;

    public Employee(String employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = 0;
        this.clockIn = 0;
        this.clockOut = 0;
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
        }

        if (this.clockOut != 0){
            this.clockIn = 0;
            this.clockOut = 0;
        }

    }
    public double getHoursWorked() {
        return hoursWorked;
    }

}
