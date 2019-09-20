package br.com.itego.cursos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.itego.cursos.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	
}
