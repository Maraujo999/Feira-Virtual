package br.com.senac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.model.Stand;
import br.com.senac.repository.StandRepository;

@Service
public class StandService {

	@Autowired
	private StandRepository standRepository;

	public Iterable<Stand> buscarTodosStands() {
		Iterable<Stand> stand = standRepository.findAll();
		return stand;

	}

	public Stand salvar(Stand stand) {
		return standRepository.save(stand);
	}

	public void excluir(int id) {
		standRepository.deleteById(id);
	}

}
