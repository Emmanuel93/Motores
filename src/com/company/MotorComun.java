package com.company;

public abstract class MotorComun implements Motor {
    @Override
    public abstract void encender();

    @Override
    public abstract void acelerar();

    @Override
    public void recorrido(){
        encender();
        acelerar();
        apagar();
    }

    @Override
    public abstract void apagar();
}
