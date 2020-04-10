package br.com.senac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.model.Stand;

public interface StandRepository extends JpaRepository<Stand, Integer> {

}
