package org.example;

import org.example.builder.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class ReferenciaBuilder implements IBuilder<Referencia> {
    private String id; //*
    private List<Autor> autorList; //*
    private Revista revista; // **
    private int año; //*
    private String doi;
    private String pais;
    private String issn;

    public ReferenciaBuilder() {
        this.autorList = new ArrayList<>();
    }

    public ReferenciaBuilder año(int año){
        this.año = año;
        return this;
    }

    public ReferenciaBuilder doi(String doi){
        this.doi = doi;
        return this;
    }

    public ReferenciaBuilder id(String id){
        this.id = id;
        return this;
    }

    public ReferenciaBuilder pais(String pais){
        this.pais = pais;
        return this;
    }

    public ReferenciaBuilder issn(String issn){
        this.issn = issn;
        return this;
    }

    public ReferenciaBuilder revista(String id, String nombre, String categoria, String editor){
        this.revista = new Revista(id, nombre, categoria, editor);
        return this;
    }

    public ReferenciaBuilder autor(String id, String name, String lastName){
        this.autorList.add(new Autor(id, name, lastName));
        return this;
    }

    @Override
    public Referencia build() {
        return new Referencia(id, autorList, revista,año,doi,pais, issn);
    }
}
