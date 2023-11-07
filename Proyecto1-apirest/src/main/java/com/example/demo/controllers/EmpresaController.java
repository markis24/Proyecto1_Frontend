package com.example.demo.controllers;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.example.demo.bean.Empresa;
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
	public Optional<Empresa> buscaPerId(@PathVariable long id) {
		return empresaRepository.findById(id);
	}

	@PostMapping("/empresa")
	@ResponseStatus(HttpStatus.CREATED)
	public Empresa afegeix(@RequestBody Empresa empresa) {
		Empresa empresa1 = empresaRepository.save(empresa);
		return empresa1;
	}

	@DeleteMapping("/empresa/{id}")
	public void esborra(@PathVariable long id) {
		empresaRepository.deleteById(id);
	}
}