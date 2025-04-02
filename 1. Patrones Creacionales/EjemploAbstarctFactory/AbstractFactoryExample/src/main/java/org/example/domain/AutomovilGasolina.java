package org.example.domain;

public class AutomovilGasolina implements IAutomovil{

    private double capacidadTanque;

    public AutomovilGasolina() {
    }

    public AutomovilGasolina(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getInfoAutomovil() {
        return "Automovil a gasolina con "+ this.capacidadTanque + " gal de capacidad ";
    }
}
