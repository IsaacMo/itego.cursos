package br.com.itego.cursos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.itego.cursos.domain.Cidade;
import br.com.itego.cursos.domain.Estado;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	List<Cidade> findByEstado(Estado estado);

}
