package br.com.senac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.senac.model.Empresa;
import br.com.senac.repository.EmpresaRepository;

@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	public Iterable<Empresa> buscarTodasEmpresas() {
		Iterable<Empresa> empresa = empresaRepository.findAll();
		return empresa;
	}

	public void excluirEmpresa(int id) {
		empresaRepository.deleteById(id);
	}

	public Empresa salvar(Empresa empresa) {
		return empresaRepository.save(empresa);
	}
}