package org.example.provider;

import org.example.factory.VehiculoFactory;

public abstract class VehiculoFactoryProvider {

    private VehiculoFactory factory;

    public VehiculoFactory getVehiculoFactory(){
        this.factory = this.create();
        return this.factory;
    }

    protected abstract VehiculoFactory create();
}
