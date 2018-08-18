package com.company.oop;

public class Phone {
    String number;
    String model;
    double weight;

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

}
