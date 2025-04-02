package org.example;

import org.example.domain.*;
import org.example.factory.VehiculoFactory;
import org.example.provider.VehiculoElectricoFactoryProvider;
import org.example.provider.VehiculoFactoryProvider;
import org.example.provider.VehiculoGasolinaFactoryProvider;

public class Main {
    public static void main(String[] args) {

        VehiculoFactoryProvider provider = null;
        configureVehiculoFactoryProvider(provider, VehiculoFamily.GASOLINA);

        VehiculoFactory factory = provider.getVehiculoFactory();
        IScooter scooter = factory.createScooter();
        IAutomovil automovil= factory.createAutomovil();

        System.out.println(scooter.getInfoScooter());
        System.out.println(automovil.getInfoAutomovil());

    }

    public static void configureVehiculoFactoryProvider(VehiculoFactoryProvider provider,
                                                        VehiculoFamily family){
        switch (family){
            case GASOLINA:provider=new VehiculoGasolinaFactoryProvider();
                          break;
            case ELECTRICO:provider=new VehiculoElectricoFactoryProvider();
                           break;
        }

    }
}