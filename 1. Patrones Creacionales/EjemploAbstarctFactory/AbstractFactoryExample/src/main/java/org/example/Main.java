package org.example;

import org.example.domain.*;
import org.example.factory.VehiculoFactory;
import org.example.factory.VehiculoGasolinaFactory;
import org.example.provider.VehiculoElectricoFactoryProvider;
import org.example.provider.VehiculoFactoryProvider;
import org.example.provider.VehiculoGasolinaFactoryProvider;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        VehiculoFactoryProvider provider ;
        provider = configureFactoryProvider(VehiculoFamily.ELECTRICO);

        VehiculoFactory factory = provider.getProvider();

        IScooter scooter = factory.createScooter();
        System.out.println(scooter.getInfoScooter());

        IAutomovil automovil= factory.createAutomovil();
        System.out.println(automovil.getInfoAutomovil());

    }

    public static VehiculoFactoryProvider configureFactoryProvider(VehiculoFamily family){
        VehiculoFactoryProvider provider;
        if (Objects.requireNonNull(family) == VehiculoFamily.ELECTRICO) {
            provider = new VehiculoElectricoFactoryProvider();
        } else {
            provider = new VehiculoGasolinaFactoryProvider();
        }
        return provider;
    }

}