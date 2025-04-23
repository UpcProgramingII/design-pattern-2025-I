package com.example.demo.controller;

import com.example.demo.domain.Estudiante;
import com.example.demo.domain.Programa;
import com.example.demo.domain.prototype.FactoryPrototype;
import com.example.demo.service.ClonarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    private ClonarService service;

    @GetMapping("/clonar")
    public List<Estudiante> clonarEstudiante(){

        Estudiante bellota = service.clonacionPprofunda("jairo");
        bellota.setNombre("bellota");
        bellota.setApellido("perez");
        bellota.getPrograma().setDescripcion("Enfermeria");
        FactoryPrototype.addProrotipo("bellota", bellota);

        Estudiante copia2 = service.clonacionPprofunda("jairo");
        return Arrays.asList(bellota, copia2);
    }
}
