package com.example.demo.domain;

import com.example.demo.domain.prototype.IPrototype;

public class Programa implements IPrototype<Programa> {

    private String id;
    private String descripcion;

    public Programa() {
    }

    public Programa(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Programa(Programa p) {
        this.id = p.id;
        this.descripcion=p.descripcion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "id='" + id + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }

    @Override
    public Programa clonacionSimple() {
        //return new Programa(this);
        Programa programa = null;
        try {
            programa = (Programa)super.clone();
            return programa;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Programa clonacionProfunda() {
        return this.clonacionSimple();
    }
}
