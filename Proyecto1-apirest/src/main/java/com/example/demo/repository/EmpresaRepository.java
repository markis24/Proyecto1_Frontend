package com.example.demo.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.bean.Empresa;


@Repository
public interface EmpresaRepository extends CrudRepository<Empresa, Long> {
}
