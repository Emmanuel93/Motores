package com.company;

public class MotorEconomico extends MotorComun{


    @Override
    public void encender() {
        System.out.println("Se esta encendiendo un motor Economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Se esta acelerando un motor Economico");
    }

    @Override
    public void apagar() {
        System.out.println("Se esta apagando un motor Economico");
    }
}
