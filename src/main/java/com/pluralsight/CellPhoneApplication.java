package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        CellPhone phone = new CellPhone();
        phone.setSerialNumber(0);
        int serialNumber = phone.getSerialNumber();
        System.out.print("What is the serial number?: ");
        java.lang.String serialName = input.nextLine();

        CellPhone cellPhone = new CellPhone();
        cellPhone.setModel("");
        String phoneModel = phone.getModel();
        System.out.print("What model is the phone?: ");
        String typeModel = input.nextLine();

        CellPhone phoneCarrier = new CellPhone();
        phoneCarrier.setCarrier("");
        String carrier = phoneCarrier.getCarrier();
        System.out.print("Who is the carrier?: ");
        String nameCarrier = input.nextLine();





    }
}
