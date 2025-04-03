package org.example.provider;

import org.example.factory.VehiculoFactory;
import org.example.factory.VehiculoGasolinaFactory;

public class VehiculoGasolinaFactoryProvider
                     extends VehiculoFactoryProvider{
    @Override
    protected VehiculoFactory create() {
        return new VehiculoGasolinaFactory();
    }
}
