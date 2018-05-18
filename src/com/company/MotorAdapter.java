package com.company;

public class MotorAdapter implements Motor{

    private MotorElectrico motorElectrico;

    public MotorAdapter(MotorElectrico motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void encender() {
        this.motorElectrico.Conectar();
        this.motorElectrico.Activar();
    }

    @Override
    public void acelerar() {
        this.motorElectrico.moverMasRapido();
    }

    @Override
    public void apagar() {
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();
    }
}
