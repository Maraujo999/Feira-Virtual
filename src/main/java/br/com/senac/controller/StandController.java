package br.com.senac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.senac.model.Stand;
import br.com.senac.service.EmpresaService;
import br.com.senac.service.StandService;

@Controller
@RequestMapping("/stand")
public class StandController {

	@Autowired
	private EmpresaService empresaService;

	@Autowired
	private StandService standService;

	@GetMapping("/listarStands")
	public ModelAndView listarTodosStands() {
		ModelAndView mv = new ModelAndView("stand/listarStand");
		mv.addObject("stands", standService.buscarTodosStands());
		return mv;
	}

	@GetMapping("/cadastrar")
	public ModelAndView cadastrarStand() {
		ModelAndView mv = new ModelAndView("stand/cadastraStand");
		mv.addObject("empresas", empresaService.buscarTodasEmpresas());
		mv.addObject("stand", new Stand());
		return mv;
	}

	@PostMapping("/salvar")
	public ModelAndView salvarStand(Stand stand) {
		standService.salvar(stand);
		return listarTodosStands();
	}

	@GetMapping("/excluir/{id}")
	public ModelAndView excluirAluno(@PathVariable("id") int id) {
		standService.excluir(id);
		return listarTodosStands();
	}

}
