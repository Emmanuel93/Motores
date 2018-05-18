package com.company;

public class Main {

    public static void main(String[] args) {

        Motor motorComun = new MotorComun();
        Motor motorEconomico = new MotorEconomico();
        Motor motorElectrico = new MotorAdapter(new MotorElectricoJapones());

        motorComun.encender();
        motorComun.acelerar();
        motorComun.apagar();
        System.out.println();

        motorEconomico.encender();
        motorEconomico.acelerar();
        motorEconomico.apagar();
        System.out.println();

        motorElectrico.encender();
        motorElectrico.acelerar();
        motorElectrico.apagar();
    }
}
