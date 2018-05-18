package com.company;

public class MotorEconomico implements Motor{
    @Override
    public void encender() {
        System.out.println("Estas encendiendo un motor economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Estas acelerando un motor economico");
    }

    @Override
    public void apagar() {
        System.out.println("Estas apagando un motor economico");
    }
}
