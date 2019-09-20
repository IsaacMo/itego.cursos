package br.com.itego.cursos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.itego.cursos.domain.Aluno;
import br.com.itego.cursos.dto.AlunoDTO;
import br.com.itego.cursos.service.AlunoService;

@RestController
@RequestMapping(value = "/aluno")
public class AlunoResource {
	
	@Autowired
	private AlunoService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody AlunoDTO dto) {
		
		service.save(AlunoDTO.dtoFromObj(dto));	
		
	}
	
	@Autowired
	private AlunoService alunoService;
	
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Aluno> findAll(){
		
		return alunoService.findAll();
	}

	
	
	@RequestMapping(value = "/{id}/pessoa",method = RequestMethod.GET)
	public List<Aluno> getAlunoByPessoa(@PathVariable Integer id) {
		
			
			Aluno aluno = alunoService.findById(id);
			
			
		return alunoService.findByAluno(aluno); 
	}
	
}
