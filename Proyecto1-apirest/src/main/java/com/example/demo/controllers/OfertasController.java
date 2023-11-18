package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Ofertas;
import com.example.demo.exception.OfertasNotFoundException;
import com.example.demo.repository.OfertasRepository;

@RestController
@RequestMapping("/api")
public class OfertasController {
    @Autowired
    private OfertasRepository ofertaRepository;

    @GetMapping("/ofertas")
    public Iterable<Ofertas> buscaTots() {
        return ofertaRepository.findAll();
    }

    @GetMapping("/ofertas/{id}")
    public Ofertas buscaPerId(@PathVariable Long id) {
        return ofertaRepository.findById(id)
                .orElseThrow(() -> new OfertasNotFoundException(id));
    }

    @PostMapping("/ofertas")
    @ResponseStatus(HttpStatus.CREATED)
    public Ofertas afegeix(@RequestBody Ofertas ofertas) {
        return ofertaRepository.save(ofertas);
    }

    @DeleteMapping("/ofertas/{id}")
    public void esborra(@PathVariable Long id) {
        ofertaRepository.deleteById(id);
    }
}
