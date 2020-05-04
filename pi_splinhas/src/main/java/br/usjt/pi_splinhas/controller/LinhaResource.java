package br.usjt.pi_splinhas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.usjt.pi_splinhas.model.Linha;
import br.usjt.pi_splinhas.repository.LinhaRepository;

@RestController
@RequestMapping("/linha")
public class LinhaResource {
	
	@Autowired
	private LinhaRepository linhaRepo;
	
	@GetMapping("/buscar")
	public List<Linha> buscarLinha(){
		
		return linhaRepo.findAll();
	}
	
	@GetMapping("/{linha}")
	public List<Linha> buscarLinhaId(@PathVariable String linha){
		
		return linhaRepo.findByLt(linha);
	}

}
