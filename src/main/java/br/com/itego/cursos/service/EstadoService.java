package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Estado;
import br.com.itego.cursos.repository.EstadoRepository;


@Service
public class EstadoService {

	
	@Autowired
	private EstadoRepository repo;
	
	//O método findById retorna um Optional
	public Estado findById(Integer id) {
		Optional<Estado> oestado = repo.findById(id);
		
		
		//Verifica se contém o estado
		if(!oestado.isPresent()) {
			return new Estado();
		}
		
		return oestado.get();
	}

	public List<Estado> findAll() {
		
		return repo.findAll();
	}

	public void save(Estado estado) {
		repo.save(estado);
		
	}

	

}
