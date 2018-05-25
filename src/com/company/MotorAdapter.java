package com.company;

public class MotorAdapter extends MotorComun{

    private MotorEcologico motorEcologico;

    public MotorAdapter(MotorEcologico motorEcologico){
        this.motorEcologico = motorEcologico;
    }

    @Override
    public void encender() {
        this.motorEcologico.conectar();
        this.motorEcologico.activar();
    }

    @Override
    public void acelerar() {
        this.motorEcologico.moverMasRapido();
    }

    @Override
    public void apagar() {
        this.motorEcologico.detener();
        this.motorEcologico.desconectar();
    }
}
