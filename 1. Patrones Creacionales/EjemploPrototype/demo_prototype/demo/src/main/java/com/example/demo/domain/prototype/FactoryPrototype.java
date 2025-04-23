package com.example.demo.domain.prototype;

import java.util.HashMap;
import java.util.Map;

public class FactoryPrototype {

    private static Map<String, IPrototype> prototipos = new HashMap<>();

    public static void addProrotipo(String name, IPrototype p){

                prototipos.put(name, p);

    }

    public static IPrototype getPrototipo(String name){

        return (IPrototype) prototipos.get(name).clonacionSimple();

    }

    public static IPrototype getPrototipoDeep(String name){

        return (IPrototype) prototipos.get(name).clonacionProfunda();

    }
}
