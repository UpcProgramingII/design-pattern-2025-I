package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Autor autor1 = new Autor("1", "Luis", "Joyanes");
        Autor autor2 = new Autor("2", "James", "Gosling");
        List<Autor> autorList = Arrays.asList(autor1, autor2);
        Revista revista = new Revista("1", "Programacio  al extremo","D1", "Bellota Lopez");


        Referencia referencia = new Referencia.ReferenciaBuilder()
                .id("1")
                .autor("1", "Luis", "Joyanes")
                .revista("1", "Programacio  al extremo","D1", "Bellota Lopez")
                .build();

        System.out.println(referencia);

        ReferenciaBuilder builder = new ReferenciaBuilder();
        Referencia ref2 = builder
                            .autor("1", "Luis", "Joyanes")
                            .año(2024)
                            .id("2")
                            .doi("sdfsdf")
                            .revista("1", "Programacio  al extremo","D1", "Bellota Lopez")
                            .build();
        System.out.println(ref2);
        Referencia ref3 = builder.id("3").build();
        System.out.println(ref3);


    }
}