package org.example.domain;

public class ScooterGasolina implements IScooter {

    private double capacidadTanque; // gal

    public ScooterGasolina() {
    }

    public ScooterGasolina(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getInfoScooter() {
        return "Scooter a gasolina con "+ this.capacidadTanque + " gal de capacidad ";
    }
}
