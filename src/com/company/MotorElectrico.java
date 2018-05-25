package com.company;

public abstract class MotorElectrico implements MotorEcologico {

    public boolean batery;

    @Override
    public abstract void conectar();

    @Override
    public abstract void activar();

    @Override
    public abstract void moverMasRapido();

    @Override
    public abstract void detener();

    @Override
    public abstract void desconectar();

    @Override
    public boolean haveBatery() {
        return this.batery;
    }

    public void recorrido(){
        activar();
        conectar();
        moverMasRapido();
        detener();
        desconectar();
    }
}
