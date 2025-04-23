package com.example.demo.domain;

import com.example.demo.domain.prototype.IPrototype;

public class Estudiante implements IPrototype<Estudiante> {

    private String id;
    private String nombre;
    private String apellido;
    private double promedio;
    private Programa programa;

    public Estudiante() {
    }

    public Estudiante(Programa programa, double promedio, String apellido, String nombre, String id) {
        this.programa = programa;
        this.promedio = promedio;
        this.apellido = apellido;
        this.nombre = nombre;
        this.id = id;
    }

    public Estudiante(Estudiante e) {

        this.id = e.getId();
        this.apellido=e.getApellido();
        this.nombre = e.getNombre();
        this.promedio = e.getPromedio();
        this.programa = e.getPrograma();

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", promedio=" + promedio +
                ", programa=" + programa +
                '}';
    }

    @Override
    public Estudiante clonacionSimple() {
        return new Estudiante(this);
    }

    @Override
    public Estudiante clonacionProfunda() {

        Programa programa = this.programa.clonacionSimple();
        return new Estudiante(programa, this.promedio,
                this.apellido, this.nombre, this.id);
    }
}
