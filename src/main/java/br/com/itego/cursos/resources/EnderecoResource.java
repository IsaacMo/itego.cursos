package br.com.itego.cursos.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Endereco;
import br.com.itego.cursos.service.EnderecoService;

@RestController
@RequestMapping(value = "/endereco")
public class EnderecoResource {

	@Autowired
	private EnderecoService enderecoService;
	
	
	@RequestMapping(value = "{id}")
	public Endereco getEndereco(@PathVariable Integer id) {
		return enderecoService.findById(id);
		
	}
	
}
