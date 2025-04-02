package org.example.provider;

import org.example.factory.VehiculoElectricoFactory;
import org.example.factory.VehiculoFactory;

public class VehiculoElectricoFactoryProvider extends VehiculoFactoryProvider{
    @Override
    protected VehiculoFactory create() {
        return new VehiculoElectricoFactory();
    }
}
