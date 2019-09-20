package br.com.itego.cursos.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Aluno extends Pessoa implements Serializable{
	private static final long serialVersionUID = -2530155560261353717L;

	@Id
	private Integer id;
	private Double notaAdmissao;
	
//	@OneToOne(optional= false)
//	@JoinColumn(name= "pessoa_id", nullable = false)
//	private Pessoa pessoa;

	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Double getNotaAdmissao() {
		return notaAdmissao;
	}
	public void setNotaAdmissao(Double notaAdmissao) {
		this.notaAdmissao = notaAdmissao;
	}

	
	
	
}
