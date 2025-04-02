package org.example.domain;

public class ScooterElectrica implements IScooter {

    private double autonomia; // kms

    public ScooterElectrica() {
    }

    public ScooterElectrica(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String getInfoScooter() {
        return "Scooter electrica con "+ this.autonomia + "kms de autonomia ";
    }
}
