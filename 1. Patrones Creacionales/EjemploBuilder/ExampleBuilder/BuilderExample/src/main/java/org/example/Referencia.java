package org.example;

import org.example.builder.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class Referencia {

    private String id; //*
    private List<Autor> autorList; //*
    private Revista revista; // **
    private int año; //*
    private String doi;
    private String pais;
    private String issn;

    protected Referencia(String id, List<Autor> autorList, Revista revista, int año, String doi, String pais, String issn) {
        this.id = id;
        this.autorList = autorList;
        this.revista = revista;
        this.año = año;
        this.doi = doi;
        this.pais = pais;
        this.issn = issn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIssn() {
        return issn;
    }

    public void setIssn(String issn) {
        this.issn = issn;
    }

    @Override
    public String toString() {
        return "Referencia{" +
                "id='" + id + '\'' +
                ", autorList=" + autorList +
                ", revista=" + revista +
                ", año=" + año +
                ", doi='" + doi + '\'' +
                ", pais='" + pais + '\'' +
                ", issn='" + issn + '\'' +
                '}';
    }

    public static class ReferenciaBuilder implements IBuilder<Referencia>{

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
}
