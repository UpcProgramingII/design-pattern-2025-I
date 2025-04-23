package com.example.demo.service;

import com.example.demo.domain.Estudiante;
import com.example.demo.domain.Postgrado;
import com.example.demo.domain.Pregrado;
import com.example.demo.domain.Programa;
import com.example.demo.domain.prototype.FactoryPrototype;
import org.springframework.stereotype.Service;

@Service
public class ClonarService {

    public ClonarService() {
        Programa programa = new Programa("1", "Sistemas");
        Estudiante jairo = new Estudiante(programa,5,"Seoanes","Jairo","123" );

        FactoryPrototype.addProrotipo("jairo", jairo);
    }

    public Estudiante clonarEstudiante(Estudiante e){
        Estudiante clon=null;
        if(e instanceof Pregrado){
            Pregrado pre = (Pregrado) e;
            clon = new Pregrado();
            clon.setId(e.getId());
            clon.setPromedio(e.getPromedio());
            clon.setPrograma(e.getPrograma());
            clon.setApellido(e.getApellido());
            clon.setNombre(e.getNombre());
            ((Pregrado)clon).setSemestre(((Pregrado)e).getSemestre());

        }else if(e instanceof Postgrado){


        }else{
            clon = new Estudiante();
            clon.setId(e.getId());
            clon.setApellido(e.getApellido());
            clon.setNombre(e.getNombre());
            clon.setPrograma(e.getPrograma());
            clon.setPromedio(e.getPromedio());

        }


        return clon;

    }


    public Estudiante clonacionSimple(String name){

        return (Estudiante) FactoryPrototype.getPrototipo(name);

    }

    public Estudiante clonacionPprofunda(String name){

       return (Estudiante) FactoryPrototype.getPrototipoDeep(name);

    }

}
