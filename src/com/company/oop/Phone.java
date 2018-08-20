package com.company.oop;

public class Phone {
    String number;
    String model;
    double weight;

    Phone(String number, String model, double weight) {
        System.out.println("Конструктор с тремя параметрами");
    }

    Phone(String number, String model) {
        System.out.println("Конструктор с двумя параметрами");
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }


}
