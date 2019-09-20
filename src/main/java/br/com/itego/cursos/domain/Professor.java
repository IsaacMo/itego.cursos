package br.com.itego.cursos.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


//Sempre utilizar para classes abstratas ele cria uma tabela para cada entidade
@Entity
public class Professor extends Pessoa implements Serializable{
	private static final long serialVersionUID = -2530155560261353717L;


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	private Date dtAdmissao;
	
	private Integer enumFormacao;
	
	@OneToOne(optional= false)
	private Pessoa pessoa;
	@JoinColumn(name= "pessoa_id", nullable = false)
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Date getDtAdmissao() {
		return dtAdmissao;
	}
	public void setDtAdmissao(Date dtAdmissao) {
		this.dtAdmissao = dtAdmissao;
	}
	public Integer getFormacao() {
		return enumFormacao;
	}
	public void setFormacao(Integer formacao) {
		this.enumFormacao = formacao;
	}
	
	
	
	
	
	
}
