package br.com.itego.cursos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Estado;
import br.com.itego.cursos.service.EstadoService;


@RestController
@RequestMapping(value = "/estado")
public class EstadoResource {
		//Injeção de dependencias
	@Autowired
	private EstadoService  estadoService;
	
	@RequestMapping(value = "{id}")
	//Indica que a variavel que você recebe é pela URL 
	public Estado getEstado(@PathVariable Integer id) {
		
		return estadoService.findById(id);
		
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Estado> findAll(){
		
		return estadoService.findAll();
		
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody Estado estado) {
		estadoService.save(estado);
		
	}
	

	

}
