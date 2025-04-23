package com.example.demo.domain;

public class Postgrado extends Estudiante{

    private String titulo;

    public Postgrado(String titulo) {
        this.titulo = titulo;
    }

    public Postgrado(Programa programa, double promedio, String apellido, String nombre, String id, String titulo) {
        super(programa, promedio, apellido, nombre, id);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String toString() {
        return "Postgrado{" + super.toString() +
                ", titulo='" + titulo + '\'' +
                '}';
    }
}
