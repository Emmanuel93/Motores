package com.company;

public class MotorElectricoJapones extends MotorElectrico {
    @Override
    public void conectar() {
        System.out.println("Se esta conectando un motor electrico japones");
    }

    @Override
    public void activar() {
        System.out.println("Se esta activando un motor electrico japones");
    }

    @Override
    public void moverMasRapido() {
        System.out.println("Se esta moviendo mas rapido un motor electrico japones");
    }

    @Override
    public void detener() {
        System.out.println("Se esta deteniendo un motor electrico japones");
    }

    @Override
    public void desconectar() {
        System.out.println("Se esta desconectando un motor electrico japones");
    }

    @Override
    public void recorrido() {
        conectar();
        activar();
        moverMasRapido();
        detener();
        desconectar();
    }
}
