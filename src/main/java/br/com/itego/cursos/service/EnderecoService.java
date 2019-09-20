package br.com.itego.cursos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Endereco;
import br.com.itego.cursos.repository.EnderecoRepository;

@Service
public class EnderecoService {
		
		@Autowired
		private EnderecoRepository repo;
		
		public Endereco findById(Integer id) {
			Optional<Endereco> oendereco = repo.findById(id);
			
			if(oendereco.isPresent()) {
				return new Endereco();
			}
			return oendereco.get();
			
		}
		
}
