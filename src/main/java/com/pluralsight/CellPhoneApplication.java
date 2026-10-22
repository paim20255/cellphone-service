package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {


        CellPhone phone = new CellPhone();
        phone.setSerialNumber(999);
        int serialNumber = phone.getSerialNumber();
        System.out.println("What is the serial number?: " + serialNumber);


    }
}
