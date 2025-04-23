package org.example;

public class Revista {

    private String id;
    private String nombre;
    private String categoria;
    private String editor;

    public Revista() {
    }

    public Revista(String id, String nombre, String categoria, String editor) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.editor = editor;
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

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", categoria='" + categoria + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}
