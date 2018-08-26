package com.company.oop;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public String getNumber() {
        return number;
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " c номерм " + number);
    }

    public void sendMessage(String... number) {
        System.out.println("Отправляю сообщение телефонам: ");
        for (String n : number) {
            System.out.println(n);
        }
    }


}
