package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.example.demo.bean.Empresa;
import com.example.demo.exception.EmpresaNotFoundException;
import com.example.demo.repository.EmpresaRepository;

@RestController
@RequestMapping("/api")
public class EmpresaController {

    @Autowired
    private EmpresaRepository empresaRepository;

    @GetMapping("/empresa")
    public Iterable<Empresa> buscaTots() {
        return empresaRepository.findAll();
    }

    @GetMapping("/empresa/{id}")
    Empresa buscaPerId(@PathVariable Long id) {
        return empresaRepository.findById(id)
                .orElseThrow(() -> new EmpresaNotFoundException());
    }

    @PostMapping("/empresa")
    @ResponseStatus(HttpStatus.CREATED)
    public Empresa afegeix(@RequestBody Empresa empresa) {
        return empresaRepository.save(empresa);
    }

    @DeleteMapping("/empresa/{id}")
    public void esborra(@PathVariable Long id) {
        empresaRepository.deleteById(id);
    }
}