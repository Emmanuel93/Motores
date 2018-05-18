package com.company;

public class MotorElectricoJapones implements MotorElectrico {

    public boolean batery;

    @Override
    public void Conectar() {
        System.out.println("Estas conectando un motor electrico");
    }

    @Override
    public void Activar() {
        System.out.println("Estas activando un motor electrico");
    }

    @Override
    public void moverMasRapido() {
        System.out.println("Estas llendo mas rapido con un motor comun");
    }

    @Override
    public void detener() {
        System.out.println("Estas deteniendo un motor electrico");
    }

    @Override
    public void desconectar() {
        System.out.println("Estas desconectando un motor electrico");
    }

    @Override
    public boolean haveBatery() {
        return this.batery;
    }
}
