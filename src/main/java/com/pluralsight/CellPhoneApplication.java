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
        cellPhone.setModel("Iphone 16 pro max!");
        String phoneModel = phone.getModel();
        System.out.println("What model is the phone?: " + cellPhone.getModel());




    }
}
