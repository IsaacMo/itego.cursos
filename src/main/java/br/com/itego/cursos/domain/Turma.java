package br.com.itego.cursos.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

public class Turma {
	private Integer id;
	private EnumTurma turma;
	private Date dtInicio;
	private Date dtFim;
	private List<Aluno> alunos;
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public EnumTurma getTurma() {
		return turma;
	}
	public void setTurma(EnumTurma turma) {
		this.turma = turma;
	}
	public Date getDtInicio() {
		return dtInicio;
	}
	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}
	public Date getDtFim() {
		return dtFim;
	}
	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	
	
	
	
	
	

}
