package com.company.oop;

public class PhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone("0958127244","Xiaomi");
        new Phone("0958127244","Xiaomi",1);
        phone1.model = "LG";
        phone1.number = "0958127244";
        phone1.weight = 2.5;

        System.out.println(phone1.model);
        System.out.println(phone1.number);
        System.out.println(phone1.weight);

        phone1.receiveCall("Мама");
        System.out.println(phone1.getNumber());
    }


}
