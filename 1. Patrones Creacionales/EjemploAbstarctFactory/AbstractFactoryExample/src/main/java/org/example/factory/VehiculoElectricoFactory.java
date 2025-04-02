package org.example.factory;

import org.example.domain.AutomovilElectrico;
import org.example.domain.IAutomovil;
import org.example.domain.IScooter;
import org.example.domain.ScooterElectrica;

public class VehiculoElectricoFactory implements VehiculoFactory{

    @Override
    public IScooter createScooter() {
        return new ScooterElectrica();
    }

    @Override
    public IAutomovil createAutomovil() {
        return new AutomovilElectrico();
    }
}
