package com.pluralsight;

public class App {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Joi","Front Desk Agent", 15.75, 45);
        System.out.println("Total Pay: $" + emp.getTotalPay());
    }
}
