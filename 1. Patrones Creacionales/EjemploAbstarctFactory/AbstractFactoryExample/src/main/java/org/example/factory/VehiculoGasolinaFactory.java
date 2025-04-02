package org.example.factory;

import org.example.domain.AutomovilGasolina;
import org.example.domain.IAutomovil;
import org.example.domain.IScooter;
import org.example.domain.ScooterGasolina;

public class VehiculoGasolinaFactory implements VehiculoFactory {

    @Override
    public IScooter createScooter() {
        return new ScooterGasolina();
    }

    @Override
    public IAutomovil createAutomovil() {
        return new AutomovilGasolina();
    }
}
