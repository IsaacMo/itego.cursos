package br.com.itego.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.itego.cursos.domain.Aluno;


@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Integer>{

	List<Aluno> findByAluno(Aluno aluno);
	
}
