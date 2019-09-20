package br.com.itego.cursos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.itego.cursos.domain.Aluno;
import br.com.itego.cursos.repository.AlunoRepository;

@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repo;

	
	public void save(Aluno aluno) {
		repo.save(aluno);
		
	}

		
		public Aluno findById(Integer id) {
			Optional<Aluno> oaluno = repo.findById(id);
			
			
			//Verifica se contém o estado
			if(!oaluno.isPresent()) {
				return new Aluno();
			}
			
			return oaluno.get();
		}


		public List<Aluno> findByAluno(Aluno aluno) {
			
			return repo.findByAluno(aluno);
		}


		public List<Aluno> findAll() {
			
			return repo.findAll();
		}
	}
	

