package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone phone = new CellPhone();
        phone.setSerialNumber(2597153);
        int serialNumber = phone.getSerialNumber();
        System.out.println("What is the serial number?: " + serialNumber);

        CellPhone cellPhone = new CellPhone();
        cellPhone.setModel("Iphone 15 pro max!");
        String phoneModel = phone.getModel();
        System.out.println("What model is the phone?: " + cellPhone.getModel());

        CellPhone phoneCarrier = new CellPhone();
        phoneCarrier.setCarrier("Verizon");
        String carrier = phoneCarrier.getCarrier();
        System.out.println("Who is the carrier?:  " + phoneCarrier.getCarrier());





    }
}
