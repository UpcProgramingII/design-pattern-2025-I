package org.example.provider;

import org.example.factory.VehiculoElectricoFactory;
import org.example.factory.VehiculoFactory;
import org.example.factory.VehiculoGasolinaFactory;

public class VehiculoElectricoFactoryProvider
                        extends VehiculoFactoryProvider{

    @Override
    protected VehiculoFactory create() {
        return new VehiculoElectricoFactory();
    }

}
