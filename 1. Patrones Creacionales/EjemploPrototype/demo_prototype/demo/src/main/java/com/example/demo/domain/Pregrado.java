package com.example.demo.domain;

public class Pregrado extends Estudiante{

    private String semestre;

    public Pregrado() {

    }

    public Pregrado(Programa programa, double promedio, String apellido, String nombre, String id, String semestre) {
        super(programa, promedio, apellido, nombre, id);
        this.semestre = semestre;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Pregrado{" + super.toString() +
                ", semestre='" + semestre + '\'' +
                '}';
    }
}
