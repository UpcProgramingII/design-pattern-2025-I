package org.example.factory;

import org.example.domain.IAutomovil;
import org.example.domain.IScooter;

public interface VehiculoFactory {

    IScooter createScooter();
    IAutomovil createAutomovil();

}
