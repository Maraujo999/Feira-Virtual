package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
