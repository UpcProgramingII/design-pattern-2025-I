package org.example.domain;

public class AutomovilElectrico implements IAutomovil {

    private double autonomia;

    public AutomovilElectrico() {
    }

    public AutomovilElectrico(double autonomia) {
        this.autonomia = autonomia;
    }

    public double getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(double autonomia) {
        this.autonomia = autonomia;
    }


@Override
    public String getInfoAutomovil() {
        return "Automovil electrico con "+ this.autonomia + "kms de autonomia ";
    }
}
