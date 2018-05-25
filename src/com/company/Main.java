package com.company;

public class Main {

    public static void main(String[] args) {

        Motor motorComun = new MotorMecanico();
        Motor motorEconomico = new MotorEconomico();
        Motor motorElectrico = new MotorAdapter(new MotorElectricoJapones());
        Motor motorHibrido =  new MotorHibridoFacade(new MotorMecanico(),new MotorElectricoJapones());

        motorComun.recorrido();
        System.out.println();

        motorEconomico.recorrido();
        System.out.println();

        motorElectrico.recorrido();
        System.out.println();

        motorHibrido.recorrido();
    }
}
