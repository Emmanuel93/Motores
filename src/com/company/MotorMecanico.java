package com.company;

public class MotorMecanico extends MotorComun{
    @Override
    public void encender() {
        System.out.println("Se esta enciendiendo un motor mecanico");
    }

    @Override
    public void acelerar() {
        System.out.println("Se esta acelerando un motor mecanico");
    }

    @Override
    public void apagar() {
        System.out.println("Se esta apagando un motor mecanico");
    }
}
