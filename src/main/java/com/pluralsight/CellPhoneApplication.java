package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone phone = new CellPhone();
        phone.setSerialNumber(2597153);
        int serialNumber = phone.getSerialNumber();
        System.out.print("What is the serial number?: " + serialNumber);
        java.lang.String serialName = input.nextLine();

        CellPhone phone1 = new CellPhone();
        phone1.setModel("iphone 15 pro max");
        String phoneModel = phone.getModel();
        System.out.print("What model is the phone?: " + phone1.getModel());
        String typeModel = input.nextLine();

        CellPhone phoneCarrier = new CellPhone();
        phoneCarrier.setCarrier("Verizon");
        String carrier = phoneCarrier.getCarrier();
        System.out.print("Who is the carrier?: " + phoneCarrier.getCarrier());
        String nameCarrier = input.nextLine();

        CellPhone phoneNumber = new CellPhone();
        phoneNumber.setPhoneNumber("888-888-8888");
        String number = phoneNumber.getPhoneNumber();
        System.out.print("What is the phone number?: " + phoneNumber.getPhoneNumber());
        String phoneNumber2 = input.nextLine();

        CellPhone phoneOwner = new CellPhone();
        phoneOwner.setOwner("");
        String owner = phoneOwner.getOwner();

        System.out.print("Who is the owner of the phone?: ");
        String owner2 = input.nextLine();

        input.close();






    }
}
