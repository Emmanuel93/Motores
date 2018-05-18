package com.company;

public class MotorComun implements Motor {
    @Override
    public void encender() {
        System.out.println("Estas encendiendo un motor comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Estas acelerando un motor comun");
    }

    @Override
    public void apagar() {
        System.out.println("Estas apagando un motor comun");
    }
}
