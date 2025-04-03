package org.example.provider;

import org.example.factory.VehiculoFactory;

public abstract class VehiculoFactoryProvider {

    private  VehiculoFactory factory;

    public VehiculoFactory getProvider(){
        this.factory = this.create();
        return this.factory;
    }

    protected abstract VehiculoFactory create();
}
