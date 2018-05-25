package com.company;

public class MotorHibridoFacade extends MotorComun {

    private Motor motorComun;

    private MotorEcologico motorEcologico;

    private MotorAdapter motorAdapter;

    public MotorHibridoFacade(Motor motorComun, MotorEcologico motorEcologico){
        this.motorComun = motorComun;
        this.motorEcologico = motorEcologico;
        this.motorAdapter = new MotorAdapter(motorEcologico);
    }

    public void encender() {
        if (motorEcologico.haveBatery()){
            this.motorAdapter.encender();
        }else{
            this.motorComun.encender();
        }

    }

    @Override
    public void acelerar() {
        if (motorEcologico.haveBatery())
            this.motorAdapter.acelerar();
        else
            this.motorComun.acelerar();

    }

    @Override
    public void apagar() {
        if (motorEcologico.haveBatery()){
            this.motorAdapter.apagar();
        }else{
            this.motorComun.apagar();
        }
    }
}
