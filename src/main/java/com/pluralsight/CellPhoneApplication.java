package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {


        CellPhone phone = new CellPhone();
        phone.setSerialNumber(2597153);
        int serialNumber = phone.getSerialNumber();
        System.out.println("What is the serial number?: " + serialNumber);


        CellPhone phone1 = new CellPhone();
        phone1.setModel("iphone 15 pro max");
        String phoneModel = phone.getModel();
        System.out.println("What model is the phone?: " + phone1.getModel());


        CellPhone phoneCarrier = new CellPhone();
        phoneCarrier.setCarrier("Verizon");
        String carrier = phoneCarrier.getCarrier();
        System.out.println("Who is the carrier?: " + phoneCarrier.getCarrier());


        CellPhone phoneNumber = new CellPhone();
        phoneNumber.setPhoneNumber("888-888-8888");
        String number = phoneNumber.getPhoneNumber();
        System.out.println("What is the phone number?: " + phoneNumber.getPhoneNumber());


        CellPhone phoneOwner = new CellPhone();
        phoneOwner.setOwner("Nate the great!");
        String owner = phoneOwner.getOwner();
        System.out.println("Who is the owner of the phone?: " + phoneOwner.getOwner());









    }
}
