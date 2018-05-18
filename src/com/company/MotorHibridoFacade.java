package com.company;

public class MotorHibridoFacade implements Motor {

    private Motor motorComun;

    private MotorElectrico motorElectrico;

    private MotorAdapter motorAdapter;

    public MotorHibridoFacade(Motor motorComun, MotorElectrico motorElectrico){
        this.motorComun = motorComun;
        this.motorElectrico = motorElectrico;
        this.motorAdapter = new MotorAdapter(motorElectrico);
    }

    public void encender() {
        if (motorElectrico.haveBatery()){
            this.motorAdapter.encender();
        }else{
            this.motorComun.encender();
        }

    }

    @Override
    public void acelerar() {
        if (motorElectrico.haveBatery()){
            this.motorAdapter.acelerar();
        }else{
            this.motorComun.acelerar();
        }
    }

    @Override
    public void apagar() {
        if (motorElectrico.haveBatery()){
            this.motorAdapter.apagar();
        }else{
            this.motorComun.apagar();
        }
    }
}
