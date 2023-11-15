package com.example.trabajoFinalComunicaciones;

import lombok.RequiredArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/formulario")
public class PersonaController {

    private final PersonaRepository personaRepository;

    @PostMapping()
    public Persona guardarPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @GetMapping ("/personas")
    public String listarPersonas() {
        Iterable<Persona> personas = personaRepository.findAll();
        return personas.toString();
    }
}
